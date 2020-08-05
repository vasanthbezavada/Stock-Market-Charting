package com.vasanth.stock.exchange.service;

import com.vasanth.stock.exchange.dao.StockExchangeDao;
import com.vasanth.stock.exchange.model.StockExchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@EnableTransactionManagement
public class StockExchangeServiceImpl implements StockExchangeService {
    @Autowired
    StockExchangeDao stockExchangeDao;
    @Transactional
    public StockExchange addStock(StockExchange stockExchange){
        stockExchangeDao.save(stockExchange);
        return stockExchange;
    }

    @Override
    @Autowired
    public List<StockExchange> findall() {
       return stockExchangeDao.findAll();
    }

}
