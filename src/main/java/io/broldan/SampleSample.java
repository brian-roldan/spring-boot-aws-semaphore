package io.broldan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleSample {

	@GetMapping("/holla")
	public String helloWorld() {
		return "{Holla:at Yo boi}";
	}

	@GetMapping("/holler")
	public String hollerWorld() {
		return "{Holler:Baller}";
	}
	
}
