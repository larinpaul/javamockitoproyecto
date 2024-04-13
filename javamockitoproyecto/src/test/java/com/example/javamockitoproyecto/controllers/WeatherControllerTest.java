package com.example.javamockitoproyecto.controllers;

import com.example.javamockitoproyecto.models.Weather;
import com.example.javamockitoproyecto.services.WeatherService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class WeatherControllerTest {

    @InjectMocks
    private WeatherController controller;

    @Mock
    private WeatherService service;

    @Test
    public void getWeather() {
        Weather weatherMock = new Weather();
        weatherMock.setMaxTemp(30);
        weatherMock.setMinTemp(15);
        weatherMock.setStatus("Sunny");
        when(service.getWeather()).thenReturn(weatherMock);

        Weather result = controller.getWeather();

        verify(service, times(1)).getWeather();
    }

    @Test   // This test will fail because we are only calling the method once, but in the test we call it twice
    public void getWeatherTwice() {
        Weather weatherMock = new Weather();
        weatherMock.setMaxTemp(30);
        weatherMock.setMinTemp(15);
        weatherMock.setStatus("Sunny");
        when(service.getWeather()).thenReturn(weatherMock);

        Weather result = controller.getWeather();

        verify(service, times(2)).getWeather();
    }

}
