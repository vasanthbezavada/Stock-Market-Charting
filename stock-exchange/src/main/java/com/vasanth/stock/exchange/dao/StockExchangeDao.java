package com.vasanth.stock.exchange.dao;

import com.vasanth.stock.exchange.model.StockExchange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockExchangeDao extends JpaRepository<StockExchange,Integer> {
}
