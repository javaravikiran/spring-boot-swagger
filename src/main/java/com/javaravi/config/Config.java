package com.javaravi.config;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration

public class Config {
	
	@PostConstruct
	public void activeProfile() {
		System.out.println("Profile loaded");
	}

	@Profile("dev")
	@Bean
	public String devBean() {
		return "dev";
	}
	
	@Profile("prod")
	@Bean
	public String prodBean() {
		return "prod";
	}
}
