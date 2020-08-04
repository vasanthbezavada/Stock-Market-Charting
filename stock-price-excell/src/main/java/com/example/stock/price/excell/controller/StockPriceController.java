package com.example.stock.price.excell.controller;

import com.example.stock.price.excell.dto.StockPriceDto;
import com.example.stock.price.excell.service.StockPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stockprice")
public class StockPriceController {
    @Autowired
    StockPriceService stockPriceService;
    @RequestMapping(method=RequestMethod.GET,value = "/check")
    public String check(){
        return " working sucessfully ";
    }

    @RequestMapping(method = RequestMethod.POST,value = "/add")
    public ResponseEntity<String> insertData(@RequestBody List<StockPriceDto> list){
        stockPriceService.add(list);
        return ResponseEntity.status(HttpStatus.OK).body("inserted sucessfully");
    }

}
