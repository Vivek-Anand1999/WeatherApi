package com.vivek.weather.weatherAPI.controller;

package com.example.weatherapi.controller;

import com.example.weatherapi.model.Weather;
import com.example.weatherapi.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @PostMapping
    public Weather addWeather(@RequestBody Weather weather) {
        return weatherService.saveWeather(weather);
    }

    @GetMapping("/{id}")
    public Weather getWeather(@PathVariable String id) {
        return weatherService.getWeatherById(id);
    }
}
