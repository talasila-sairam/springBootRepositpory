package com.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.mvc.ParameterizableViewController;

@SpringBootApplication
public class SpringBootJdbcApplication {
    public SpringBootJdbcApplication() {
    	System.out.println("inside SpringBootApplication class constructor");
	}
    
    @Bean("/address.htm")
    public ParameterizableViewController parameterizableViewController () {
    	System.out.println("inside parameterizable view controller method");
        ParameterizableViewController parameterizableViewController= new ParameterizableViewController();
        parameterizableViewController.setViewName("display-address"); 
        return parameterizableViewController;
    }
    
	public static void main(String[] args) {
		System.out.println("main method");
		SpringApplication.run(SpringBootJdbcApplication.class, args);
	}
}
