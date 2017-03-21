package com.xind.xindassistant;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferenceUtils {
    private static final String KEY_PREF_TRUN_ON_TIME = "key_turn_on_time";
    private static final String KEY_PREF_TRUN_OFF_TIME = "key_turn_off_time";
    private static final String KEY_PREF_DATA_ENABLED = "key_data_enabled";
    private static final String KEY_PREF_WIFI_ENABLED = "key_wifi_enabled";

    private static SharedPreferences getSharedPreferences(Context context) {
        return context.getSharedPreferences(context.getApplicationContext().getPackageName(), Context.MODE_PRIVATE);
    }

    public static void setTimeTurnOn(Context context, String value) {
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        editor.putString(KEY_PREF_TRUN_ON_TIME, value);
        editor.apply();
    }

    public static String getTimeTurnOn(Context context) {
        return getSharedPreferences(context).getString(KEY_PREF_TRUN_ON_TIME, "");
    }

    public static void setTimeTurnOff(Context context, String value) {
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        editor.putString(KEY_PREF_TRUN_OFF_TIME, value);
        editor.apply();
    }

    public static String getTimeTurnOff(Context context) {
        return getSharedPreferences(context).getString(KEY_PREF_TRUN_OFF_TIME, "");
    }

    public static void setDataEnabled(Context context, boolean value) {
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        editor.putBoolean(KEY_PREF_DATA_ENABLED, value);
        editor.apply();
    }

    public static boolean getDataEnabled(Context context) {
        return getSharedPreferences(context).getBoolean(KEY_PREF_DATA_ENABLED, false);
    }

    public static void setWifiEnabled(Context context, boolean value) {
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        editor.putBoolean(KEY_PREF_WIFI_ENABLED, value);
        editor.apply();
    }

    public static boolean getWifiEnabled(Context context) {
        return getSharedPreferences(context).getBoolean(KEY_PREF_WIFI_ENABLED, false);
    }
}
