package com.example.myviewpage_ksenia;

import android.content.Context;
import android.content.SharedPreferences;

public class Prefs {
    private SharedPreferences preferences;

    public Prefs(Context context){
        preferences=context.getSharedPreferences("settings",Context.MODE_PRIVATE);
    }
    public void saveBoardState(){preferences.edit().putBoolean("isShown",true).apply();}
    public boolean isShown(){return preferences.getBoolean("isShown",false);}
    public void SaveString(String textProfile){
        preferences.edit().putString("text",textProfile).apply();}
    public String getStringData(){
        return preferences.getString("text","");}
    public void clear(){preferences.edit().clear().apply();}
    public void saveImage(String result){
        preferences.edit().putString("avatar",result).apply();}
    public String getAvatar(){return preferences.getString("avatar",null);}
}