package com.vasanth.company;

import com.vasanth.company.dto.CompanyDto;
import com.vasanth.company.service.CompanyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class CompanyApplication {

	public static void main(String[] args) {
		ApplicationContext app =
		SpringApplication.run(CompanyApplication.class, args);
		// loading sample data to data base
		CompanyService companyService = app.getBean(CompanyService.class);
		companyService.addComp(new CompanyDto("vasanth and co","vasanth","myself","yes","Agro","Good company","vas 101"));
		companyService.addComp(new CompanyDto("kumar and co","vasanth","myself","yes","Agro","Good company","vas 101"));

	}

}
