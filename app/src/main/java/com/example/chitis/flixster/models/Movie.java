package com.example.chitis.flixster.models;

import org.json.JSONObject;
import org.json.JSONException;

public class Movie {

    // values from api
    private String title;
    private String overview;
    private String posterPath; // only the path
    private String backdropPath;

    // initialize from the JSON data
    public Movie(JSONObject object) throws JSONException {
        title = object.getString("title");
        overview = object.getString("overview");
        posterPath = object.getString("poster_path");
        backdropPath = object.getString("backdrop_path");

    }

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public String getBackdropPath() {
        return backdropPath;
    }
}
