package com.sb.app;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;

import com.sb.app.dto.Student;

@Configuration
public class JavaConfig {
	@Bean(name="igitastudents")
	public Student student(){
		
		return new Student();
	}

}
