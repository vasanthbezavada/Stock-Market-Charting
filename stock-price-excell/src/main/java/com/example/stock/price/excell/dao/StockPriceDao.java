package com.example.stock.price.excell.dao;

import com.example.stock.price.excell.model.StockPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockPriceDao extends JpaRepository<StockPrice,Integer> {

}
