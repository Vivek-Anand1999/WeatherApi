package com.vivek.weather.weatherAPI.service;

package com.example.weatherapi.service;

import com.example.weatherapi.model.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    private static final String TOPIC = "weather-topic";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendWeatherUpdate(Weather weather) {
        kafkaTemplate.send(TOPIC, weather.getCity(), weather.toString());
    }
}
