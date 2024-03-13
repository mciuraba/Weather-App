package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String apiKey = "f2581490b0d14b26a3b100645241303";
        String city = "Warsaw";
        String apiUrl = "https://api.weatherapi.com/v1/current.json?key=" + apiKey + "&q=" + city;
        String weatherData = "";

        try {
            weatherData = GetWeatherData(apiUrl);
            //System.out.println(weatherData);

        } catch (Exception e) {
            e.printStackTrace();
        }

        DataParser(weatherData);

        Gson gson = new Gson();
        WeatherData weatherData_obj = gson.fromJson(weatherData, WeatherData.class);

        System.out.println("Location : " + weatherData_obj.location.toString());
        System.out.println("Current : " + weatherData_obj.current.toString());


    }

    public static String GetWeatherData(String apiUrl) throws Exception{
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        StringBuilder response = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();
        connection.disconnect();

        // Parse the JSON response and return weather information
        return response.toString();

    }

    public static void DataParser(String weatherData){

    }
}