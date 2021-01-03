package com.tianshu.singleton.v1;

/**
 * 饿汉式
 *  不足:在类加载时就会创建,若不需要这个对象会浪费内存
 */
public class SingletonClass {

    private static final SingletonClass INSTANCE = new SingletonClass();

    private SingletonClass(){}

    public static SingletonClass getInstance(){
        return INSTANCE;
    }
}
