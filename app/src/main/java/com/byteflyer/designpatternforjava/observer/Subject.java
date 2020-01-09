package com.byteflyer.designpatternforjava.observer;

/**
 * 定义被观察者
 */
public interface Subject {
    public void attach(Observer obj);

    public void detach(Observer obj);

    public void notifyObserver(String topicName);
}
