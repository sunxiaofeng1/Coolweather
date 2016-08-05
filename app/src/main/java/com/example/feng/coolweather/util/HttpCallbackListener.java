package com.example.feng.coolweather.util;

/**
 * Created by feng on 2016/8/4.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
