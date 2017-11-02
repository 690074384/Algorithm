package com.lph.Singleton;

/**
 * 双重锁校验
 */

public class Singleton {

    private Singleton(){}

    private static volatile Singleton singleton = null;

    public static Singleton getInstance(){
        if(singleton==null){
            synchronized (Singleton.class){
                singleton = new Singleton();
            }
        }
        return singleton;
    }

}
