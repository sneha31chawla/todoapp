package com.jts.todo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TodoManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoManagementSystemApplication.class, args);
	}
	
	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

}
