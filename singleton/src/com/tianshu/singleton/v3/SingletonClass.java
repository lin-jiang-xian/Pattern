package com.tianshu.singleton.v3;

/**
 * 懒汉式(获取方式上锁)
 *      不足:效率低
 */
public class SingletonClass {

    private static SingletonClass INSTANCE;

    private SingletonClass(){}

    public static synchronized SingletonClass getInstance(){
        if(INSTANCE == null){
            INSTANCE = new SingletonClass();
        }
        return INSTANCE;
    }

}
