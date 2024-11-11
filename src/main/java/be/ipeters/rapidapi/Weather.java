package be.ipeters.rapidapi;

// src/main/java/be/ipeters/rapidapi/service/WeatherService.java

public class Weather {
    private String main;
    private List<WeatherDescription> description;
    private List<WeatherIcon> icon;

    // Getters and setters for the properties

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public List<WeatherDescription> getDescription() {
        return description;
    }

    public void setDescription(List<WeatherDescription> description) {
        this.description = description;
    }

    public List<WeatherIcon> getIcon() {
        return icon;
    }

    public void setIcon(List<WeatherIcon> icon) {
        this.icon = icon;
    }
}
