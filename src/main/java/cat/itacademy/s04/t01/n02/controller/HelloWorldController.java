package cat.itacademy.s04.t01.n02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	// Ruta: http://localhost:9001/HelloWorld2
	// Ruta: http://localhost:9001/HelloWorld2?name=Pablo
	@GetMapping("/HelloWorld2")
	public String hello(@RequestParam(value = "name", defaultValue = "Unknown") String name) {
		return String.format("Hello %s! \n" +
				"You are running a Gradle project", name);
	}

	// Ruta: http://localhost:9001/HelloWorld2
	// Ruta: http://localhost:9001/HelloWorld2/Pablo
	@GetMapping("/HelloWorld2/{name}")
	public String hello2(@PathVariable String name) {
		return String.format("Hello %s! \n" +
				"You are running a Gradle project", name);
	}
}