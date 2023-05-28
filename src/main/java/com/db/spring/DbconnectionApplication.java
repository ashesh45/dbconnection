package com.db.spring;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.ApplicationContext;

import com.db.spring.dao.UserRepository;
@SpringBootApplication
public class DbconnectionApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(DbconnectionApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		User user= new User();
		user.setName("maharjan");
       user.setCity("kathmandu");
        user.setStatus("good");
		
		User User1 = userRepository.save(user);
		System.out.println(user);
	}
}
