package com.byteflyer.designpatternforjava.singleton;

/**
 * 懒汉模式，线程安全
 *
 * 效率差
 * 加了synchronized为独占排它锁，并发性能差
 */
public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2(){
    }

    public static synchronized Singleton2 getInstance(){
        if(instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
}
