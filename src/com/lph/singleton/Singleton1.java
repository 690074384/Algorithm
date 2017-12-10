package com.lph.singleton;

/**
 * 静态内部类实现单例
 */
public class Singleton1 {

    private Singleton1(){}
    private static class SingletonClassHoader{
        private static final Singleton1 NEWINSTANCE = new Singleton1();
    }

    public static Singleton1 getInstance(){
        return SingletonClassHoader.NEWINSTANCE;
    }

}
