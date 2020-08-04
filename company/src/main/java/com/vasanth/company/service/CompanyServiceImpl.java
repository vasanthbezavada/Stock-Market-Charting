package com.vasanth.company.service;

import com.vasanth.company.dao.ComapanyDao;
import com.vasanth.company.dto.CompanyDto;
import com.vasanth.company.model.Company;
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
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private ComapanyDao comapanyDao;
    @Transactional
    public List<CompanyDto> findAll(){
        List<Company> companies =  comapanyDao.findAll();
        ModelMapper mapper = new ModelMapper();
        Type listType = new TypeToken<List<CompanyDto>>(){}.getType();
        List<CompanyDto> postDtoList = mapper.map(companies,listType);
        return postDtoList;
    }
    @Transactional
    public CompanyDto addComp(CompanyDto dto){
        ModelMapper map = new ModelMapper();
        Company comp = map.map(dto,Company.class);
        comapanyDao.save(comp);
        return dto;
    }
    @Transactional
    public CompanyDto deleteComp(CompanyDto dto){
        ModelMapper map = new ModelMapper();
        comapanyDao.delete(comapanyDao.findByName(dto.getName()));
        return dto;
    }
    @Transactional
    public CompanyDto updateComp(CompanyDto dto){
        ModelMapper maper = new ModelMapper();
        Company oldCompany = comapanyDao.findByName(dto.getName());
        Company newComp = maper.map(dto,Company.class);
        newComp.setId(oldCompany.getId());
        comapanyDao.save(newComp);

        return dto;
    }

}
