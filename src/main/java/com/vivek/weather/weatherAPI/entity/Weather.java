package com.vivek.weather.weatherAPI.entity;

package com.example.weatherapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "weather")  // Specifies the MongoDB collection name
public class Weather {

    @Id
    private String id;  // The unique identifier for the document

    private String city;         // Name of the city
    private String temperature;  // Temperature in the city
    private String condition;    // Weather condition (e.g., Clear, Rainy)

    // Constructors
    public Weather() {
    }

    public Weather(String city, String temperature, String condition) {
        this.city = city;
        this.temperature = temperature;
        this.condition = condition;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "id='" + id + '\'' +
                ", city='" + city + '\'' +
                ", temperature='" + temperature + '\'' +
                ", condition='" + condition + '\'' +
                '}';
    }
}
