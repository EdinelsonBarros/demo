package formController;


import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import formDomain.Row;
import formDomain.RowList;
import formDomain.TestRows;
import formDomain.TestRowsList;


@Controller
public class FormController {
	
	
	
	@GetMapping("/")
	public String showForm(Model model) {	
		RowList rowList = new RowList();

		for(int i = 1; i <= 3; i++) {
			rowList.add(new Row());
		}
		
		System.out.println(rowList.size());
		model.addAttribute("rowList", rowList);
		return "index";
	}
	
	@GetMapping("/rows")
	public String showRows(Model model) {	
		TestRowsList testRowList = new TestRowsList();

		for(int i = 1; i <= 3; i++) {
			testRowList.add(new TestRows());
		}
		
		System.out.println(testRowList.size());
		model.addAttribute("testRowList", testRowList);
		return "rows";
	}
	
	
	/*
	 * @PostMapping("/addRows") public String addRows(Model model) { Row newRow =
	 * new Row(); listRows.add(newRow);
	 * 
	 * Solução aqui
	 * https://www.baeldung.com/thymeleaf-list
	 * }
	 */
	
	
	
}
	

