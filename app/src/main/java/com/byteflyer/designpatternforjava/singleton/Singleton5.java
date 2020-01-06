package com.byteflyer.designpatternforjava.singleton;

/**
 * 枚举
 *
 * 实现单例模式的最佳方法
 * 它更简洁，自动支持序列化机制，绝对防止多次实例化和线程安全的
 *
 * 调用方式：Singleton5.INSTANCE.action();
 */
public enum Singleton5 {
    INSTANCE;
    public void action(){}
}
