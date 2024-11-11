package be.ipeters.rapidapi;

// src/main/java/be/ipeters/rapidapi/service/WeatherService.java

public class WeatherResponse {
    private String name;
    private Main main;
    private List<Weather> weather;

    // Getters and setters for the properties

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }
}
