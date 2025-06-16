package formController;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import formDomain.Row;

@Controller
public class FormController {
	
	private final List<Row> listRows = new ArrayList<>();
	
	@GetMapping("/")
	public String showForm(Model model) {	
		listRows.add(new Row());
		model.addAttribute("listRows",listRows);
		return "index";
	}
	
	/*
	 * @PostMapping("/addRows") public String addRows(Model model) { Row newRow =
	 * new Row(); listRows.add(newRow);
	 * 
	 * }
	 */
	
	
	
}
	

