$('#mytable').on('input custmoInput', 'td[contenteditable=true]', function() {
	let td = $(this);
	let tr = td.closest('tr');
	let rowIndex = tr.index();
	let colName = td.data('col');
	let value = td.text().trim();

	// Verifica se é campo de data para aplicar a máscara dinamicamente
	if ((colName === 'dtini' || colName === 'dtfim') && !td.find('input').length) {
		td.empty();

		const input = $('<input type="text" maxlength="10" />')
			.val(value)
			.appendTo(td)
			.mask('00/00/0000')
			.focus();

		// Quando sair do input, validar e salvar valor novamente
		input.on('blur', function() {
			const val = $(this).val().trim();
			if (val === '' || isValidDate(val)) {
				input.remove();
				td.text(val);
				td.trigger('customInput'); // Evita repetir 'input'
				document.querySelector("#invalidDate").innerHTML = ""; // limpa msg de erro
				return;
			} else {
				const span = document.querySelector("#invalidDate");
				span.innerHTML = "Informe uma data válida";
				setTimeout(() => {
					input.focus();
				}, 10); // foco imediato
			}
		});
		return; // cancela o restante do processo enquanto estiver com input
	}

	// Salva dados no localStorage
	let rowData = JSON.parse(localStorage.getItem('linha_' + rowIndex)) || {};
	rowData[colName] = value;
	localStorage.setItem('linha_' + rowIndex, JSON.stringify(rowData));

	// Verifica se todas as células foram preenchidas
	let totalCols = tr.find('td').length;
	let filledCols = Object.values(rowData).filter(v => v !== '').length;

	if (filledCols === totalCols) {
		$.ajax({
			url: '/rowSave',
			type: 'POST',
			contentType: 'application/json',
			data: JSON.stringify(rowData),
			success: function(response) {
				alert('Linha salva com sucesso!');
				//localStorage.removeItem('linha_' + rowIndex);
				tr.find('td').attr('contenteditable', 'false');
			},
			error: function() {
				alert('Erro ao salvar a linha!');
			}
		});
	}
});

// Validação de data
function isValidDate(dateString) {
	const [day, month, year] = dateString.split('/').map(Number);
	const date = new Date(year, month - 1, day);
	return (
		date.getFullYear() === year &&
		date.getMonth() === month - 1 &&
		date.getDate() === day
	);
}
