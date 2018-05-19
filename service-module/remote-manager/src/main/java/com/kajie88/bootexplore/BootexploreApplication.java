package com.kajie88.bootexplore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BootexploreApplication extends SpringBootServletInitializer{
	//for tomcat
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(BootexploreApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(BootexploreApplication.class, args);
	}
}
