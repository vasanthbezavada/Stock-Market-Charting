package com.vasanth.company.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class IpoDetailsDto {
    private String companyName;
    private String stockExchange;
    private double pricePerShare;
    private int totalNumberOfShares;
    private Date openDateTime;
    private String Remarks;
}
