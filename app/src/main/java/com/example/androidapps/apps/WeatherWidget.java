package com.example.androidapps.apps;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidapps.R;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WeatherWidget extends AppCompatActivity {

    EditText etCity;
    Button btnGetWeather;
    TextView tvTemperature, tvCondition, tvWeatherInfo;

    String apiKey = "a3be14358cfc5140e42b46ac63eba416";
    ExecutorService executorService;
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_widget);

        etCity = findViewById(R.id.etCity);
        btnGetWeather = findViewById(R.id.btnGetWeather);
        tvTemperature = findViewById(R.id.tvTemperature);
        tvCondition = findViewById(R.id.tvCondition);
        tvWeatherInfo = findViewById(R.id.tvWeatherInfo);

        // Initialize ExecutorService and Handler
        executorService = Executors.newSingleThreadExecutor();
        handler = new Handler(Looper.getMainLooper());

        btnGetWeather.setOnClickListener(v -> {
            String city = etCity.getText().toString().trim();
            if (!city.isEmpty()) {
                fetchWeatherData(city);
            } else {
                Toast.makeText(WeatherWidget.this, "Please enter a city name", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void fetchWeatherData(String cityName) {
        executorService.execute(() -> {
            String result = "";
            String urlString = "http://api.openweathermap.org/data/2.5/weather?q=" + cityName + "&appid=" + apiKey + "&units=metric";
            try {
                URL url = new URL(urlString);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");

                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    sb.append(line);
                }
                result = sb.toString();
            } catch (Exception e) {
                Log.e("WeatherWidget", "Error fetching weather data", e);
                result = null;
            }

            String finalResult = result;
            handler.post(() -> displayWeatherData(finalResult));
        });
    }

    private void displayWeatherData(String result) {
        if (result == null) {
            Toast.makeText(WeatherWidget.this, "City not found", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            JSONObject jsonObject = new JSONObject(result);
            JSONObject main = jsonObject.getJSONObject("main");
            double temp = main.getDouble("temp");
            String condition = jsonObject.getJSONArray("weather").getJSONObject(0).getString("description");

            tvWeatherInfo.setText(String.format("Weather in %s", jsonObject.getString("name")));
            tvTemperature.setText(String.format("Temperature: %.2f °C", temp));
            tvCondition.setText(String.format("Condition: %s", condition));
        } catch (Exception e) {
            Toast.makeText(WeatherWidget.this, "City not found", Toast.LENGTH_SHORT).show();
            Log.e("WeatherWidget", "Error parsing weather data", e);
        }
    }
}
