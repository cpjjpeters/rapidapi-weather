package be.ipeters.rapidapi;

// src/main/java/be/ipeters/rapidapi/service/WeatherService.java

public class Main {
    private double temp;
    private double feels_like;
    private double pressure;
    private int humidity;

    // Getters and setters for the properties

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getFeelsLike() {
        return feels_like;
    }

    public void setFeelsLike(double feels_like) {
        this.feels_like = feels_like;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}