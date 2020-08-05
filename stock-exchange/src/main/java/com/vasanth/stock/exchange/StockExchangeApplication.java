package com.vasanth.stock.exchange;

import com.vasanth.stock.exchange.model.StockExchange;
import com.vasanth.stock.exchange.service.StockExchangeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableEurekaClient
public class StockExchangeApplication {

	public static void main(String[] args) {
		ApplicationContext app =
		SpringApplication.run(StockExchangeApplication.class, args);
		// initializing sample data to dataBase
		StockExchangeService stockExchangeService = app.getBean(StockExchangeService.class);
		stockExchangeService.addStock(new StockExchange(1,"BSE"));
		stockExchangeService.addStock(new StockExchange(2,"NSE"));
	}

}
