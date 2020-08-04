package com.example.stock.price.excell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StockPriceExcellApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockPriceExcellApplication.class, args);
	}

}
