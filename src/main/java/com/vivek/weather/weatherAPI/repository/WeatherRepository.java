package com.vivek.weather.weatherAPI.repository;

package com.example.weatherapi.repository;

import com.example.weatherapi.model.Weather;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WeatherRepository extends MongoRepository<Weather, String> {
}
