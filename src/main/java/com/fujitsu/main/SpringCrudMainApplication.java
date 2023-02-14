package com.fujitsu.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.fujitsu.main.repository")
public class SpringCrudMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCrudMainApplication.class, args);
	}

}
