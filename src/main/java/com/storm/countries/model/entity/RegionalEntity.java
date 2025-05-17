package com.storm.countries.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "regional_entity")
public class RegionalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private String capital;

    @Column(nullable = false)
    private Integer population;

    // km^2
    @Column(nullable = false)
    private Integer area;

    // meters
    @Column(nullable = false)
    private Integer altitudeHi;

    // meters
    @Column(nullable = false)
    private Integer altitudeLo;
}



