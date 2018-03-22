package io.broldan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {

	@GetMapping("/hello")
	public String helloWorld() {
		return "{hello:sample}";
	}

	@GetMapping("/hi")
	public String hiWorld() {
		return "{hi:sample}";
	}
	
}
