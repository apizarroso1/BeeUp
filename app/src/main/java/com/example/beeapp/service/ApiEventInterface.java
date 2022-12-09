package com.example.beeapp.service;

import com.example.beeapp.model.Chat;
import com.example.beeapp.model.Event;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiEventInterface {

    @POST("event/insert")
    Call<Event> insertEvent(@Body Event event);

    @GET("event/findallevents")
    Call<List<Event>> findAllEventsFromUser(@Query("userId") String userId);
}