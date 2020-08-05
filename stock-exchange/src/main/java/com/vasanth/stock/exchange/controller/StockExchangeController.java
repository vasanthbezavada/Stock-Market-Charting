package com.vasanth.stock.exchange.controller;

import com.vasanth.stock.exchange.model.StockExchange;
import com.vasanth.stock.exchange.service.StockExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/exchanges")
public class StockExchangeController {
    @Autowired
    StockExchangeService stockExchangeService;
    // to do
    @RequestMapping(method = RequestMethod.POST,value = "/add")
    public ResponseEntity<StockExchange> add(@RequestBody StockExchange stockExchange){
        return ResponseEntity.status(HttpStatus.OK).body(stockExchangeService.addStock(stockExchange));
    }
    @RequestMapping(method = RequestMethod.GET,value = "/all")
    public ResponseEntity<List<StockExchange>> add(){
        return ResponseEntity.status(HttpStatus.OK).body(stockExchangeService.findall());
    }
}
