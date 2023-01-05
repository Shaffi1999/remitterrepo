package com.ltimindtree.remitter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RemitterServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RemitterServiceApplication.class, args);
	}
	@GetMapping("/")
	public String welcome()
	{
		return "remiiter Service Welcomes You!";
	}
	
	@GetMapping("/{name}")
	public String welcome1(@PathVariable String name)
	{
		return "remiiter Service Welcomes You"+name;
	}
	
	@GetMapping("/remitter")
	public String greeting()
	{
		return "remiiter end point";
	}
	

}
