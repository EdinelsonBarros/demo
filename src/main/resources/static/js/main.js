$(document).ready(function () {
    $('#mytable tbody tr').each(function () {
        $(this).find('td').each(function (index) {
            var valor = $(this).text();
            console.log('Linha:', $(this).parent().index(), 'Coluna:', index, 'Valor:', valor);
        });
    });
});