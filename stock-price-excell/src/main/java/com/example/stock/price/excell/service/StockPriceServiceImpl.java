package com.example.stock.price.excell.service;


import com.example.stock.price.excell.dao.StockPriceDao;
import com.example.stock.price.excell.dto.StockPriceDto;
import com.example.stock.price.excell.model.StockPrice;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Type;
import java.util.List;

@Service
@EnableTransactionManagement
public class StockPriceServiceImpl implements StockPriceService{
    @Autowired
    StockPriceDao stockPriceDao;


    @Override
    @Transactional
    public void add(List<StockPriceDto> list) {
        ModelMapper mapper = new ModelMapper();
        Type listType = new TypeToken<List<StockPrice>>(){}.getType();
        List<StockPrice> stockPriceList = mapper.map(list,listType);
        for(StockPrice item : stockPriceList)
            stockPriceDao.save(item);
    }
}
