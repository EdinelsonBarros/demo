package formController;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import formDomain.FormValidate;

@RestController
public class FormController {
	
	@GetMapping("/")
	public String showForm() {		
		return "home";
	}
	
	
	
}
