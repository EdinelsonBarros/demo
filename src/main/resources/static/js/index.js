$(document).on('click', '.editavel	', function(){
	const td = $(this);
	td.css("padding: 0px;");
	const textOriginal = td.text().trim();
	
	//Previne edição múltipla
	if (td.find('input').length > 0) return;
	
	td.html(`<input type="text" value="${textOriginal}" />`);
	td.find('input').focus().blur(function() {
		const novoValor = $(this).val();
		td.text(novoValor || textOriginal);
	})
})