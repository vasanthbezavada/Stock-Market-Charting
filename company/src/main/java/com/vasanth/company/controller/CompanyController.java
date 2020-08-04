package com.vasanth.company.controller;

import com.vasanth.company.client.SectorClient;
import com.vasanth.company.client.StockPriceClient;
import com.vasanth.company.dto.CompanyDto;
import com.vasanth.company.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/companies")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CompanyController {
    @Autowired
    CompanyService companyService;
    @Autowired
    StockPriceClient stockPriceClient;
    @Autowired
    SectorClient sectorClient;
    @RequestMapping(method = RequestMethod.GET,value = "/all")
    public ResponseEntity<List<CompanyDto>> findAll(){
     return ResponseEntity.status(HttpStatus.OK).body(companyService.findAll());
    }
    @RequestMapping(method = RequestMethod.POST,value = "/add")
    public ResponseEntity<CompanyDto> addCompanyDto(@RequestBody CompanyDto dto){
        return ResponseEntity.status(HttpStatus.OK).body(companyService.addComp(dto));
    }
    @RequestMapping(method = RequestMethod.POST,value = "/delete")
    public ResponseEntity<CompanyDto> deleteCompanyDto(@RequestBody CompanyDto dto){
        return ResponseEntity.status(HttpStatus.OK).body(companyService.deleteComp(dto));
    }
    @RequestMapping(method = RequestMethod.POST,value = "/update")
    public ResponseEntity<CompanyDto> updateCompanyDto(@RequestBody CompanyDto dto){
        return ResponseEntity.status(HttpStatus.OK).body(companyService.updateComp(dto));
    }

    @RequestMapping(method=RequestMethod.GET,value="/checkprice")
    public String checkStockPriceServer(){
        return stockPriceClient.check();
    }
    @GetMapping("/sectors")
    public List<String> listSectors(){
        return sectorClient.sectors();
    }
}
