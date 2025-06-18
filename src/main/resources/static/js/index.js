$(document).ready(function () {
    $('#mytable td[contenteditable=true]').on('input', function () {
        let td = $(this);
        let tr = td.closest('tr');
        let rowIndex = tr.index();
        let colName = td.data('col');
        let value = td.text().trim();

        // Lê ou inicia dados salvos da linha
        let rowData = JSON.parse(localStorage.getItem('linha_' + rowIndex)) || {};
        rowData[colName] = value;

        // Salva no localStorage
        localStorage.setItem('linha_' + rowIndex, JSON.stringify(rowData));

        // Verifica se todas as células foram preenchidas
        let totalCols = tr.find('td').length;
        let filledCols = Object.values(rowData).filter(v => v !== '').length;

        if (filledCols === totalCols) {
            // Envia para o backend
            $.ajax({
                url: '/api/linhas',
                type: 'POST',
                contentType: 'application/json',
                data: JSON.stringify(rowData),
                success: function (response) {
                    alert('Linha salva com sucesso!');
                    localStorage.removeItem('linha_' + rowIndex);
                    tr.find('td').attr('contenteditable', 'false');
                },
                error: function () {
                    alert('Erro ao salvar a linha!');
                }
            });
        }
    });
});
