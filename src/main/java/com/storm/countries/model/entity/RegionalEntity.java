package com.storm.countries.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "regional_entity")
public class RegionalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false, unique = true)
    private String capital;

    @Column(nullable = false, unique = true)
    private Integer population;

    @Column(nullable = false, unique = true)
    private Integer squareKilometers;

    @Column(nullable = false, unique = true)
    private Integer hiAltitude;

    @Column(nullable = false, unique = true)
    private Integer loAltitude;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Integer getSquareKilometers() {
        return squareKilometers;
    }

    public void setSquareKilometers(Integer squareKilometers) {
        this.squareKilometers = squareKilometers;
    }

    public Integer getHiAltitude() {
        return hiAltitude;
    }

    public void setHiAltitude(Integer hiAltitude) {
        this.hiAltitude = hiAltitude;
    }

    public Integer getLoAltitude() {
        return loAltitude;
    }

    public void setLoAltitude(Integer loAltitude) {
        this.loAltitude = loAltitude;
    }
}
