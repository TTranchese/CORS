package co.develhope.corsExample.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/custom")
public class Controller {
	
	@GetMapping
	public String getWelcome(){
		return "Hello";
	}

}
