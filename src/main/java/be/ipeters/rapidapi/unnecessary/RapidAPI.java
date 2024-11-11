package be.ipeters.rapidapi.unnecessary;

/* carlpeters created on 06/11/2024 inside the package - be.ipeters.recap.unnecessary */
public class RapidAPI {

    OkHttpClient client = new OkHttpClient();

    Request request = new Request.Builder()
            .url("https://weatherbit-v1-mashape.p.rapidapi.com/forecast/3hourly?lat=35.5&lon=-78.5&units=imperial&lang=en")
            .get()
            .addHeader("x-rapidapi-key", "2dbcebe6e9msh57d487d8fd06ab4p1dcb25jsnbf0cb6f2253d")
            .addHeader("x-rapidapi-host", "weatherbit-v1-mashape.p.rapidapi.com")
            .build();

    Response response = client.newCall(request).execute();
}
