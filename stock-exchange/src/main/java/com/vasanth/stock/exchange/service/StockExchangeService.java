package com.vasanth.stock.exchange.service;

import com.vasanth.stock.exchange.model.StockExchange;

import java.util.List;

public interface StockExchangeService {
    public StockExchange addStock(StockExchange stockExchange);

    public List<StockExchange> findall();
}
