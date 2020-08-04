package com.vasanth.sector.service;

import com.vasanth.sector.dao.SectorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@EnableTransactionManagement
public class SectorServiceImpl implements SectorService {
    @Autowired
    SectorDao sectorDao;

    @Override
    @Transactional
    public List<String> findAllSectors() {
      return sectorDao.getAllSect();
    }
}
