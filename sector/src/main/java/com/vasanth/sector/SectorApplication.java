package com.vasanth.sector;

import com.vasanth.sector.dao.SectorDao;
import com.vasanth.sector.model.Sector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableEurekaClient
public class SectorApplication {

	public static void main(String[] args) {
		ApplicationContext app =
		SpringApplication.run(SectorApplication.class, args);
		SectorDao sectorDao = app.getBean(SectorDao.class);
		sectorDao.save(new Sector(1,"Agro","agriculturual related companies"));
		sectorDao.save(new Sector(2,"Chemical","Chemical related companies"));
		sectorDao.save(new Sector(3,"Telicom","Telicom related companies"));
		sectorDao.save(new Sector(4,"Medical","Medical related companies"));
	}

}
