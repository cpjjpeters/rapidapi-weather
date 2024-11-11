package be.ipeters.rapidapi.unnecessary;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

@Service
public class WeatherService {

    @Value("${rapidapi.host}")
    private String apiHost;

    @Value("${rapidapi.key}")
    private String apiKey;

    private final RestTemplate restTemplate = new RestTemplate();

    public String getCurrentWeather(String city) {
        String url = "https://open-weather-map.p.rapidapi.com/weather?q=" + city + "&units=metric";

        HttpHeaders headers = new HttpHeaders();
        headers.set("X-RapidAPI-Host", apiHost);
        headers.set("X-RapidAPI-Key", apiKey);

        HttpEntity<String> entity = new HttpEntity<>(headers);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

        if (response.getStatusCode().is2xxSuccessful()) {
            JsonObject jsonResponse = JsonParser.parseString(response.getBody()).getAsJsonObject();
            return jsonResponse.toString();
        } else {
            return "Error: Unable to fetch weather data";
        }
    }
}