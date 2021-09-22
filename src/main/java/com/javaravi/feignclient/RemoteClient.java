package com.javaravi.feignclient;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@FeignClient(name="spring-boot-jenkins-demo",url="http://localhost:9090/jenkins")
public interface RemoteClient {
	
	@GetMapping(value="/demo")
	public String getUserDetails(@RequestParam("name") String name);

}
 