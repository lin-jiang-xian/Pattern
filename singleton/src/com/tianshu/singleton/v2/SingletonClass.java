package com.tianshu.singleton.v2;

/**
 *  懒汉式
 *      存在线程安全问题
 */

public class SingletonClass {
    private static SingletonClass INATANCE;

    private SingletonClass(){}

    public static SingletonClass getInstance(){
        if(INATANCE == null){
            INATANCE = new SingletonClass();
        }
        return INATANCE;
    }

}
