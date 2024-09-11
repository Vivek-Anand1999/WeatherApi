package com.vivek.weather.weatherAPI.service;

package com.example.weatherapi.service;

import com.example.weatherapi.model.Weather;
import com.example.weatherapi.repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    @Autowired
    private WeatherRepository weatherRepository;

    @Autowired
    private KafkaProducerService kafkaProducerService;

    public Weather saveWeather(Weather weather) {
        Weather savedWeather = weatherRepository.save(weather);
        kafkaProducerService.sendWeatherUpdate(savedWeather);
        return savedWeather;
    }

    public Weather getWeatherById(String id) {
        return weatherRepository.findById(id).orElse(null);
    }
}
