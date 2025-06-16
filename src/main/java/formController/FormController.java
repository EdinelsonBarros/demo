package formController;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import formDomain.FormValidate;

@Controller
public class FormController {
	
	@GetMapping("/")
	public String showForm() {		
		return "index";
	}
	
	
	
}
	

