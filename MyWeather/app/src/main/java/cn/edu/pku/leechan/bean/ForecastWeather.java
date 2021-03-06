package cn.edu.pku.leechan.bean;

import java.io.Serializable;



public class ForecastWeather implements Serializable {

    private String date;
    private String type;
    private String high;
    private String low;
    private String fengli;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getFengli() {
        return fengli;
    }

    public void setFengli(String fengli) {
        this.fengli = fengli;
    }

    @Override
    public String toString() {
        return "ForecastWeather{" +
                "date='" + date + '\'' +
                ", type='" + type + '\'' +
                ", high='" + high + '\'' +
                ", low='" + low + '\'' +
                ", fengli='" + fengli + '\'' +
                '}';
    }
}
