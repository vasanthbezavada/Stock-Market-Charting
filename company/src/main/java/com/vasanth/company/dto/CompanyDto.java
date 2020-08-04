package com.vasanth.company.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public class CompanyDto {
    public CompanyDto(String name, String ceo, String boardOfDirectors, String listedInStockExchanges, String sector, String briefWriteUp, String stockCode) {
        this.name = name;
        this.ceo = ceo;
        this.boardOfDirectors = boardOfDirectors;
        this.listedInStockExchanges = listedInStockExchanges;
        this.sector = sector;
        this.briefWriteUp = briefWriteUp;
        this.stockCode = stockCode;
    }

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
