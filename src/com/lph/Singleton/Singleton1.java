package com.lph.Singleton;

/**
 * 静态内部类实现单例
 */
public class Singleton1 {

    private Singleton1(){}
    private static class SingletonClassHoader{
        private static final Singleton1 getSingleton1 = new Singleton1();
    }

    public static Singleton1 getInstance(){
        return SingletonClassHoader.getSingleton1;
    }

}
