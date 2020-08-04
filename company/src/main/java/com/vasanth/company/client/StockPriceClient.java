package com.vasanth.company.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("stockpriceserver")
public interface StockPriceClient {
    @RequestMapping(method= RequestMethod.GET,value = "/stockprice/check")
    public String check();
}
