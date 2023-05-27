package com.example.labopenclassroom.labopenclassroom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.labopenclassroom.labopenclassroom.model.HelloWord;
import com.example.labopenclassroom.labopenclassroom.service.BusinessService;

@SpringBootApplication
public class LabopenclassroomApplication implements CommandLineRunner {
	@Autowired
	private BusinessService bs;

	public static void main(String[] args) {
		SpringApplication.run(LabopenclassroomApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method 
		HelloWord he = bs.getHelloWorld();
		System.out.println(he);
		 
	}
 
}
