package primeira.pro.camila.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Teste {
	
	@GetMapping("/v1")
	public String hello() {
	return "Hello v1!";
	}

}
