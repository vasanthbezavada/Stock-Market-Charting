package com.vasanth.stock.exchange.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Getter
@Setter
@Entity
public class StockExchange {


    @Id
    @GeneratedValue
    private int id;
    private String stockExchange;

    public StockExchange(int i, String EX) {
        this.id=i;
        this.stockExchange=EX;
    }
    public StockExchange() {
    }
}
