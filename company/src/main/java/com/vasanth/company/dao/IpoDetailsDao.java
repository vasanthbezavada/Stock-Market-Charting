package com.vasanth.company.dao;

import com.vasanth.company.model.IpoDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IpoDetailsDao extends JpaRepository<IpoDetails,Integer> {
}
