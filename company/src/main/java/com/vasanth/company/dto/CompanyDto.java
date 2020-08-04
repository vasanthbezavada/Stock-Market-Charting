package com.vasanth.company.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CompanyDto {
    private String name;
    private String ceo;
    private String boardOfDirectors;
    private String listedInStockExchanges;
    private String sector;
    private String briefWriteUp;
    private String stockCode;

    public String getName() {
        return this.name;
    }
}
