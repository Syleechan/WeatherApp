package cn.edu.pku.leechan.util;

import android.content.Context;
import android.content.SharedPreferences;

import static android.content.Context.MODE_PRIVATE;



public class SPFutils {
    public static String getStringData(Context context, String key, String defaultValue) {
        SharedPreferences spf = context.getSharedPreferences("config", MODE_PRIVATE);
        String value = spf.getString(key,defaultValue);
        return value;
    }

    public static void saveStringData(Context context, String key, String value) {
        SharedPreferences spf = context.getSharedPreferences("config", MODE_PRIVATE);
        SharedPreferences.Editor edit = spf.edit();
        edit.putString(key, value);
        edit.commit();
    }
}
