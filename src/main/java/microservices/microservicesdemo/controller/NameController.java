package microservices.microservicesdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import microservices.microservicesdemo.models.NameSender;

@RestController

public class NameController {

	 
//	     @Value("${app.number1}")
//	     private Integer number1;
//	     @Value("${app.number2}")
//	     private Integer number2;
	     @Autowired
	     private NameSender nameSender;
	 
	     @GetMapping("/name")
	     public NameSender getName()
	     {
	         return new NameSender(nameSender.getFirstName(),nameSender.getLastName());
	     }
	     
	 }
	
