package be.ipeters.rapidapi.service;

import be.ipeters.rapidapi.WeatherResponse;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import retrofit2.Call;

import java.io.IOException;

@Service
public class WeatherService {

    @Value("${rapidapi.host}")
    private String apiHost;

    @Value("${rapidapi.key}")
    private String apiKey;

    private final OkHttpClient client = new OkHttpClient();

    public String getCurrentWeather(double lat, double lon) {
        String url = "https://weatherbit-v1-mashape.p.rapidapi.com/forecast/3hourly?lat=" + lat + "&lon=" + lon + "&units=imperial&lang=en";

        Request request = new Request.Builder()
                .url(url)
                .get()
                .addHeader("x-rapidapi-key", apiKey)
                .addHeader("x-rapidapi-host", apiHost)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful() && response.body() != null) {
                return response.body().string();
            } else {
                return "Error: Unable to fetch weather data, response code: " + response.code();
            }
        } catch (IOException e) {
            e.printStackTrace();
            return "Error: Exception occurred while fetching weather data";
        }
    }

    public Call<WeatherResponse> getWeatherData(String newYork) {
    }
}