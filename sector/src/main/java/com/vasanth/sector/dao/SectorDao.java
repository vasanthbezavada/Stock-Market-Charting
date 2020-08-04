package com.vasanth.sector.dao;

import com.vasanth.sector.model.Sector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SectorDao extends JpaRepository<Sector,Integer> {
    @Query("select s.sector from Sector s")
    public List<String> getAllSect();
}
