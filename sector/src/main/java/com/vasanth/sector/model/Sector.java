package com.vasanth.sector.model;

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
public class Sector {
    @Id
    private int id;
    private String sector;
    private String brief;

    public Sector() {
    }

    public Sector(int id, String sector, String brief) {
        this.id=id;
        this.brief=brief;
        this.sector=sector;
    }
}
