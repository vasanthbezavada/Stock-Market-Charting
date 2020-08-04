package com.example.stock.price.excell.service;

import com.example.stock.price.excell.dto.StockPriceDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StockPriceService {
    public void add(List<StockPriceDto> list);
}
