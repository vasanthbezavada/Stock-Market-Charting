package com.vasanth.stock.exchange.service;

import com.vasanth.stock.exchange.dao.StockExchangeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Service
@EnableTransactionManagement
public class StockExchangeServiceImpl implements StockExchangeService {
    @Autowired
    StockExchangeDao stockExchangeDao;


}
