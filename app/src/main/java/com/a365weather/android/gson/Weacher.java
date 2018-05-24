package com.a365weather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weacher {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
