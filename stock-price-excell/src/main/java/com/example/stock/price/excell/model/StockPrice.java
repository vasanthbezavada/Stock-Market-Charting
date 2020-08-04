package com.example.stock.price.excell.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity

public class StockPrice {
    @GeneratedValue
    @Id
    int id;
    String companyCode;
    String exchange;
    Double price;
    Date date;
}
