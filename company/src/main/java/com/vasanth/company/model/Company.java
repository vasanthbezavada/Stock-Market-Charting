package com.vasanth.company.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
   private String name;
   private String ceo;
   private String boardOfDirectors;
   private String listedInStockExchanges;
   private String sector;
   private String briefWriteUp;
   private String stockCode;

    public int getId() {
        return this.id;
    }
    public void setId(int id){
        this.id=id;
    }
}
