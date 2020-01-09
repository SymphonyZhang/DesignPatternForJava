package com.byteflyer.designpatternforjava.observer;

import android.util.Log;

public class TopicSubscriber implements Observer {

    private static final String TAG = "TopicSubscriber";

    private String name;

    public TopicSubscriber(String name){
        this.name = name;
    }

    @Override
    public void update(String topicName) {
        Log.i(TAG,  name +"  topic name update:  "+topicName);
    }
}
