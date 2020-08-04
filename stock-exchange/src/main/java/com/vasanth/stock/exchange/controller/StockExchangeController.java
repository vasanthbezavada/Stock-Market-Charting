package com.vasanth.stock.exchange.controller;

import com.vasanth.stock.exchange.service.StockExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exchanges")
public class StockExchangeController {
    @Autowired
    StockExchangeService stockExchangeService;
    // to do
}
