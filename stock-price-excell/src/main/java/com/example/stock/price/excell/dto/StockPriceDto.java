package com.example.stock.price.excell.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StockPriceDto {
    int id;
    String companyCode;
    String exchange;
    Double price;
    Date date;
}
