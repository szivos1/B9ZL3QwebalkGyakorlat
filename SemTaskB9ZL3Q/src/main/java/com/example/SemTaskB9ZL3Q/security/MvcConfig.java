package com.example.SemTaskB9ZL3Q.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/home").setViewName("home");
		registry.addViewController("/").setViewName("home");
		registry.addViewController("/login").setViewName("login");
		registry.addViewController("/aquapark").setViewName("aquapark");
		registry.addViewController("/poolConfig").setViewName("poolConfig");
		registry.addViewController("/refresh").setViewName("refresh");

	}

}