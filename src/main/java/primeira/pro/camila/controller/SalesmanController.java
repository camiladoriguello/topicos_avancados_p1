package primeira.pro.camila.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import primeira.pro.camila.dto.SalesmanDTO;
import primeira.pro.camila.service.SalesmanService;

@RestController
@RequestMapping("/salesmen")
public class SalesmanController {
	
	@Autowired
	private SalesmanService service;
	
	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public void createSalesman(@RequestBody SalesmanDTO salesman) {
		service.createSalesman(salesman);
	}
	
	@GetMapping("/{registry}")
	public ResponseEntity<SalesmanDTO> getProductById(@PathVariable Long registry) {
		SalesmanDTO dto = new SalesmanDTO(service.findById(registry));
		return ResponseEntity.ok().body(dto);
	}
	
	@PutMapping("changeActive/{registry}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void chengeActive(@PathVariable Long registry) {
        service.changeActive(registry);
    }

}
