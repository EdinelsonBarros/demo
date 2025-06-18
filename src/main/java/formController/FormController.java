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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import formDomain.Row;
import formDomain.RowList;



@Controller
public class FormController {
	
	
	@GetMapping("/")
	public String showForm(Model model) { 
		return "index"; 
	  }

	
	  @PostMapping("/rowSave") 
	  public String addRows(@RequestBody Row request) { 
		
	  
	  
	  return "";
	  }
	 
	
	
	
}
	

