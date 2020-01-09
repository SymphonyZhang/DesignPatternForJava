package com.byteflyer.designpatternforjava.observer;

import java.util.ArrayList;
import java.util.List;

public class Topic implements Subject {
    private List<Observer> list;

    public Topic(){
        list = new ArrayList<>();
    }

    @Override
    public void attach(Observer obj) {
        if(obj == null){
            return;
        }
        if(!list.contains(obj)){
            list.add(obj);
        }
    }

    @Override
    public void detach(Observer obj) {
        if(obj == null){
            return;
        }
        if(list.contains(obj)){
            list.remove(obj);
        }
    }

    @Override
    public void notifyObserver(String topicName) {
        for (Observer observer :list) {
            observer.update(topicName);
        }
    }
}
