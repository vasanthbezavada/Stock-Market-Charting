package com.vasanth.company.service;


import com.vasanth.company.dto.CompanyDto;
import com.vasanth.company.dto.IpoDetailsDto;
import com.vasanth.company.model.IpoDetails;

import java.util.List;

public interface IpoDetailsService {

    public List<IpoDetailsDto> findAll();
    public IpoDetailsDto addComp(IpoDetailsDto dto);
}
