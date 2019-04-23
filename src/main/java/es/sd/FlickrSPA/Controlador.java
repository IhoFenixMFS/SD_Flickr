package es.sd.FlickrSPA;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {

	@RequestMapping("/")
	public String base(Model model) {

		return "index.html";
	}

	@RequestMapping("/home")
	public String home(Model model) {
		
		return base(model);
	}
	
}