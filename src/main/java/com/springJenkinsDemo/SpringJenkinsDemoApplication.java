package com.springJenkinsDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsDemoApplication.class, args);
		System.out.println("Hello Dev-Ops");
	}

}
