package com.vasanth.company.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class IpoDetails {
    @Id
    @GeneratedValue
    private int id;
    private String companyName;
    private String stockExchange;
    private double pricePerShare;
    private int totalNumberOfShares;
    private Date openDateTime;
    private String Remarks;
}
