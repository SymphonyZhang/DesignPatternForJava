package com.byteflyer.designpatternforjava.singleton;

/**
 * 静态内部类
 *
 * 类被装载了，instance不一定被初始化，只有在调用的时候才进行加载，大佬了
 * 类似懒汉模式的效果，而这种方法又是线程安全的。
 */
public class Singleton4 {
    private static class SingletonHolder{
        private static final Singleton4 INSTANCE= new Singleton4();
    }
    private Singleton4(){}
    public static final Singleton4 getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
