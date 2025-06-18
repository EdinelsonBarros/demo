package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import formDomain.Row;
import repositories.RowRepository;

@Service
public class RowService {
	@Autowired
	RowRepository rowRepository;
	
	public String saveRow(Row r) {
		if(r != null) {
			rowRepository.save(r);
			return "Linha salva com sucesso!";
		} else {
			return "Não foi possível salvar linha";
		}
	}
}
