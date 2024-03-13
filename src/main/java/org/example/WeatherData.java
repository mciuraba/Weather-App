package org.example;

public class WeatherData {
    WeatherLocationData location;
    CurrentWeatherData current;

    public WeatherLocationData getLocation() {
        return location;
    }

    public void setLocation(WeatherLocationData location) {
        this.location = location;
    }

    public CurrentWeatherData getCurrent() {
        return current;
    }

    public void setCurrent(CurrentWeatherData current) {
        this.current = current;
    }
}
