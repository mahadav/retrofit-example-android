package com.learn.zone.retrofitexample;

import com.google.gson.annotations.SerializedName;

/**
 * Created by learn-zone on 18/3/17.
 */
public class ServerTime {
    @SerializedName("time")
    private String time;
    @SerializedName("date")
    private String date;
    @SerializedName("milliseconds_since_epoch")
    private String milliSeconds;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMilliSeconds() {
        return milliSeconds;
    }

    public void setMilliSeconds(String milliSeconds) {
        this.milliSeconds = milliSeconds;
    }
}
