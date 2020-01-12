package cn.edu.pku.leechan.bean;



public class Global {
    public static String WEATHER_RECEIVED = "android.appwidget.action.APPWIDGET_UPDATE";//广播的ACTION
    public static String WEATHER_PM25_RECEIVED = "pm25info_received";//广播的ACTION
    public static String CITY_CODE = "101010100";//全局的当前城市码
    public static String URL_BASE = "http://wthrcdn.etouch.cn/WeatherApi?citykey=";
    public static int FLAG = 0;//标志是省会还是普通城市，省会：1，普通：0


}
