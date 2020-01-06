package com.byteflyer.designpatternforjava.singleton;

/**
 * 饿汉式
 *
 * 在类加载的时候，就完成了对象的初始化，类加载保证了他们天生是线程安全的
 * 并没有lazy loading的效果，如果从始至终从未使用过这个实例，则会造成内存的浪费
 */
public class Singleton3 {
    private static Singleton3 instance = new Singleton3();

    private Singleton3(){}

    public static Singleton3 getInstance(){
        return instance;
    }
}
