package com.vasanth.company.controller;


import com.vasanth.company.dto.IpoDetailsDto;
import com.vasanth.company.service.IpoDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ipo")
public class IpoDetailsController {
    @Autowired
    IpoDetailsService ipoDetailsService;

    @RequestMapping(method = RequestMethod.GET,value = "/all")
    public ResponseEntity<List<IpoDetailsDto>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(ipoDetailsService.findAll());
    }
    @RequestMapping(method = RequestMethod.POST,value = "/add")
    public ResponseEntity<IpoDetailsDto> addCompanyDto(@RequestBody IpoDetailsDto dto){
        return ResponseEntity.status(HttpStatus.OK).body(ipoDetailsService.addComp(dto));
    }
}
