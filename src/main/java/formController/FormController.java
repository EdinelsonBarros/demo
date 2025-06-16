package formController;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import formDomain.FormValidate;

@RestController
@RequestMapping("/api")
public class FormController {
	
	@GetMapping("/home")
	public String showForm() {		
		return "home";
	}
	
	
	
}
