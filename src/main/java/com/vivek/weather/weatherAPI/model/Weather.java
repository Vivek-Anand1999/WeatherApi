package com.vivek.weather.weatherAPI.model;

package com.example.weatherapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "weather")
public class Weather {
    @Id
    private String id;
    private String city;
    private String temperature;
    private String condition;

    // Getters and setters
}

