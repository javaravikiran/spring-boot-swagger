package com.javaravi.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableFeignClients(basePackageClasses=com.javaravi.feignclient.RemoteClient.class)
@ComponentScan(basePackages = "com.javaravi.config,com.javaravi.controller,com.javaravi.feignclient")
public class SpringBootSwaggerDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootSwaggerDemoApplication.class, args);
		
		
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

}
