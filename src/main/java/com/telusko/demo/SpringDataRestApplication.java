package com.telusko.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestApplication.class, args);
	}

	//data.sql file is not working in this, its h2 Db's issue.. add some field manually on h2 console to experience springDataRest
}
