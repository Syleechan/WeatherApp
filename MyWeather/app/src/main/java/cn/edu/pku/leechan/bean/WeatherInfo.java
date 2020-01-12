package cn.edu.pku.leechan.bean;

import java.io.Serializable;
import java.util.List;



public class WeatherInfo implements Serializable {
    TodayWeather todayWeather;
    List<ForecastWeather> forecastWeathers;
    public WeatherInfo(){

    }

    public TodayWeather getTodayWeather() {
        return todayWeather;
    }

    public void setTodayWeather(TodayWeather todayWeather) {
        this.todayWeather = todayWeather;
    }

    public List<ForecastWeather> getForecastWeathers() {
        return forecastWeathers;
    }

    public void setForecastWeathers(List<ForecastWeather> forecastWeathers) {
        this.forecastWeathers = forecastWeathers;
    }
}
