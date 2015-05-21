package com.argumedo.kevin.beerapp;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Featured {
    private String beerId, name, description;
    public Featured(JSONObject jsonFeatured) throws JSONException
    {
        this.beerId = (String) jsonFeatured.optString("id");
        this.name = (String) jsonFeatured.optString("name");
        this.description = (String) jsonFeatured.optString("description");

    }

    public static ArrayList<Featured> getFeaturedBeer(String featuredData) throws JSONException
    {
        ArrayList<Featured> featuredBeer = new ArrayList<>();
        JSONObject results = new JSONObject(featuredData);
        JSONObject data = results.optJSONObject("data");
        JSONObject beer = data.optJSONObject("beer");

        JSONObject fBeer = data.optJSONObject("beer");
        Featured BotW = new Featured(fBeer);
        Log.d("FUCK YOU FUCKING FUCKER", BotW.getName());
        featuredBeer.add(BotW);

        return featuredBeer;

    }

    public String getName() {
        return name;
    }


    public String getBeerId() {
        return beerId;
    }

    public String getDescription() {
        return description;
    }

}
