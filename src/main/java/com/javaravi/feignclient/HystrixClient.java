package com.javaravi.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
@FeignClient(name="spring-boot-cloud-demo",url="http://localhost:8080/hystrix")
public interface HystrixClient {	
	@GetMapping(value="/fault-tolerance")
	public String getfallbackDetails();

}
 
