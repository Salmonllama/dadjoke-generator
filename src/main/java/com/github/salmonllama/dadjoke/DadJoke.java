package com.github.salmonllama.dadjoke;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;

import java.io.IOException;

public class DadJoke {

    private static final String JOKE_URL = "https://icanhazdadjoke.com/";
    private static final String USER_AGENT = "Dad's birthday app - github(https://github.com/Salmonllama/dadjoke-generator)";

    public static String getJoke() throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder().build();

        Request request = new Request.Builder()
                .url(JOKE_URL)
                .addHeader("Accept", "application/json")
                .addHeader("User-Agent", USER_AGENT)
                .build();

        Response response = client.newCall(request).execute();

        String json = response.body().string();
        response.close();
        return new JSONObject(json).getString("joke");
    }
}
