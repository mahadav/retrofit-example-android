package com.learn.zone.retrofitexample.webservice;

import com.learn.zone.retrofitexample.ServerTime;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by learn-zone on 18/3/17.
 */
public interface Api {
    @GET("/")
    public Call<ServerTime> getServerTime();
}
