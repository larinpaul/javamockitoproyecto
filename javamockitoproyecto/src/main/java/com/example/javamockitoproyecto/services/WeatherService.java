package com.example.javamockitoproyecto.services;

import com.example.javamockitoproyecto.models.Weather;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class WeatherService {

    public Weather getWeather() {
        Weather weather = new Weather();
        weather.setMaxTemp(10);
        weather.setMinTemp(8);
        weather.setStatus("Cloudy");
        return weather;
    }

}
