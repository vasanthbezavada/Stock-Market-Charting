package com.vasanth.company.service;

import com.vasanth.company.dao.IpoDetailsDao;
import com.vasanth.company.dto.IpoDetailsDto;
import com.vasanth.company.model.IpoDetails;
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
public class IpoDetailsServiceImpl implements IpoDetailsService {
    @Autowired
    private IpoDetailsDao ipoDetailsDao;
    @Override
    @Transactional
    public List<IpoDetailsDto> findAll() {
        List<IpoDetails> companies =  ipoDetailsDao.findAll();
        ModelMapper mapper = new ModelMapper();
        Type listType = new TypeToken<List<IpoDetailsDto>>(){}.getType();
        List<IpoDetailsDto> postDtoList = mapper.map(companies,listType);
        return postDtoList;
    }

    @Override
    @Transactional
    public IpoDetailsDto addComp(IpoDetailsDto dto) {
        ModelMapper map = new ModelMapper();
        IpoDetails comp = map.map(dto,IpoDetails.class);
        ipoDetailsDao.save(comp);
        return dto;
    }
}
