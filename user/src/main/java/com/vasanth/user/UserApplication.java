package com.vasanth.user;

import com.vasanth.user.model.User;
import com.vasanth.user.service.UserService;
import com.vasanth.user.service.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;

@EnableEurekaClient
@SpringBootApplication
public class UserApplication {

	public static void main(String[] args) {
		ApplicationContext app =
		SpringApplication.run(UserApplication.class, args);
		// initializing sample data while starting the server
		UserService userService= app.getBean(UserService.class);
		userService.saveUser(new User(1, "admin","admin", "admin", "admin@gmail.com",9999999,"yes"));
	}

}
