package com.st.travelsmartapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TravelsmartApiApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {

		SpringApplication.run(TravelsmartApiApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(TravelsmartApiApplication.class);
	}

}
