$(document).on('click', '.editavel', function () {
	const td = $(this);
	td.css("padding", "2px");
	const textOriginal = td.text().trim();
	
	// Previne edição múltipla
	if (td.find('input').length > 0) return;

	// Cria input
	td.html(`<input type="text" value="${textOriginal}" />`);
	td.find('input').focus().blur(function () {
		const novoValor = $(this).val();
		td.text(novoValor || textOriginal);

		// Atualiza localStorage após edição
		let qdtRows = parseInt($('#qtdrows').data('qtd'));
		console.log("qtdRows =", qdtRows)
		for (let i = 0; i < qdtRows; i++) {
			const row = {
				numlinha: $('#numlinha_' + i).text().trim(),
				numfunc: $('#numfunc_' + i).text().trim(),
				numvinc: $('#numvinc_' + i).text().trim(),
				nome: $('#nome_' + i).text().trim(),
				cpf: $('#cpf_' + i).text().trim(),
				dtini: $('#dtini_' + i).text().trim(),
				dtfim: $('#dtfim_' + i).text().trim(),
				cargo: $('#cargo_' + i).text().trim(),
				codigo_atividade: $('#codigo_atividade_' + i).text().trim(),
				setor: $('#setor_' + i).text().trim(),
				disciplina: $('#disciplina_' + i).text().trim(),
				aih: $('#aih_' + i).text().trim(),
				arquivo: $('#arquivo_' + i).text().trim(),
			};

			localStorage.setItem('row_' + i, JSON.stringify(row));
			console.log("Salvo Row_" + i, row);
		}
	});
});
