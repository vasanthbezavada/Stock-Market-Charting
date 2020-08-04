package com.vasanth.company.dao;

import com.vasanth.company.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComapanyDao extends JpaRepository<Company,Integer> {
    public Company findByName(String name);
}
