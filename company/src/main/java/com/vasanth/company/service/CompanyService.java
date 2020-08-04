package com.vasanth.company.service;

import com.vasanth.company.dto.CompanyDto;
import com.vasanth.company.model.Company;

import java.util.List;

public interface CompanyService  {
    public List<CompanyDto> findAll();
    public CompanyDto addComp(CompanyDto dto);
    public CompanyDto deleteComp(CompanyDto dto);
    public CompanyDto updateComp(CompanyDto dto);
}
