package com.javaravi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/javaravi")
public class HelloController {
	@GetMapping(value = "/welcome")
	public String sayHello() {
		return "Swagger Hello World";
	}

	@GetMapping("/getDetails")
	public List<String> getDetails() {
		List<String> li = new ArrayList<>();
		li.add("Ravi");
		li.add("Priya");
		li.add("Hasvika");
		li.add("Lakshmi");
		return li;
	}
}