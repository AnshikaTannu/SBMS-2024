
package com.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRestController {

	@GetMapping("/about")
	public String getMsg() {
		
		return "my self anshika";
	}

	@GetMapping("/contact")
	public String contact() {
		return "Plz call:: +91 7989101518";
	}
	
	@GetMapping("/deposite")
	public String deposite() {
		return "Deposite successfully...";
	}
	
	@GetMapping("/withdraw")
	public String withdraw() {
		return "withdraw successfully....";
	}
	
	
	
	
}
