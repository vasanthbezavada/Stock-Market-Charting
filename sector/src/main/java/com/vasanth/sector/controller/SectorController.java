package com.vasanth.sector.controller;

import com.vasanth.sector.service.SectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/sectors")
@RestController
public class SectorController {
    @Autowired
    SectorService sectorService;
    @GetMapping("/all")
    public List<String> findAllSect(){
        return sectorService.findAllSectors();
    }
}
