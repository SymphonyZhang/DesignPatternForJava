package com.byteflyer.designpatternforjava.singleton;


/**
 * 双重校验锁法
 *
 * 双锁机制，安全且在多线程情况下能保持高性能
 */
public class Singleton6 {
    private volatile static Singleton6 singleton;

    private Singleton6(){}

    public static Singleton6 getInstance(){
        if(singleton == null){
            synchronized (Singleton6.class){
                if(singleton == null){
                    singleton = new Singleton6();
                }
            }
        }
        return singleton;
    }
}
