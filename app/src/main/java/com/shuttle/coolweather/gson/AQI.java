package com.shuttle.coolweather.gson;

/**
 * Created by shuttle on 2017/12/14.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
