package com.example.javamockitoproyecto.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @EqualsAndHashCode
public class Weather {

    private String status;
    private Integer temperature;
    private Integer maxTemp;
    private Integer minTemp;

}
