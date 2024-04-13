package com.example.javamockitoproyecto.controllers;

import com.example.javamockitoproyecto.models.Weather;
import com.example.javamockitoproyecto.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @Autowired
    private WeatherService service;

    @GetMapping("/api/weather")
    public Weather getWeather() {
        return service.getWeather();
    }

}
