package com.vasanth.company.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("sectorserver")
public interface SectorClient {
   @GetMapping("/sectors/all")
    public List<String> sectors();
}
