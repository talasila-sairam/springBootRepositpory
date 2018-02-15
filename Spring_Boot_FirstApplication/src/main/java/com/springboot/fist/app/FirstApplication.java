package com.springboot.fist.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstApplication {
  public static void main(String[] args) {
	System.out.println("inside main method");
	SpringApplication.run(FirstApplication.class, args);
}
}
