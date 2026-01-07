package com.example.ems_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EmsBackendApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(EmsBackendApplication.class, args);
		Project obj=context.getBean(Project.class);
		obj.show();
	}

}
