package com.javaravi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaravi.feignclient.HystrixClient;
import com.javaravi.feignclient.RemoteClient;


@RestController
@RequestMapping(value = "/api/javaravi")
@Import(FeignClientsConfiguration.class)
public class HelloController {
	
	@Autowired
	private RemoteClient feignClient;
	
	@Autowired
	private HystrixClient hystrixClient;
	
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
	
	@GetMapping("/feignclientcall")
	public String calljenkinsdemoApp(@RequestParam("name") String name) {
		return feignClient.getUserDetails(name);
	}
	
	@GetMapping("/feignclienthystrixcall")
	public String callhystrixdemoApp() {
		return hystrixClient.getfallbackDetails();
	}
}