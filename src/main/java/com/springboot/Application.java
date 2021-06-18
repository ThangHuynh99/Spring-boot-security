package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
//SecurityAutoConfiguration.class fix loi chua dang nhap va phan quyen
public class Application {

	public static void main(String args[]) {
		SpringApplication.run(Application.class, args);
	}
	
}