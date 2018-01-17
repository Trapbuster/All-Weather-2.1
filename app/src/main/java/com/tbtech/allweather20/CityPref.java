package com.tbtech.allweather20; /**
 * Created by Uddesh on 10-01-2018.
 */

import android.app.Activity;
import android.content.SharedPreferences;

public class CityPref {

    SharedPreferences prefs;

    public CityPref(Activity activity){
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    // If the user has not chosen a city yet, return
    // Sydney as the default city
    String getCity(){
        return prefs.getString("city", "Allahabad, IN");
    }

    void setCity(String city){
        prefs.edit().putString("city", city).commit();
    }

}