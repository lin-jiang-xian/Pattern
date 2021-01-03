package com.tianshu.singleton.v4;

/**
 * 懒汉式(双判):必须使用 volatile 禁止指令重排序
 *      可以通过反射创建多个对象
 */
public class SingletonClass {
    private volatile static SingletonClass INSTANCE;
    private SingletonClass(){}

    public static SingletonClass getInstance(){
        if(INSTANCE == null){
            synchronized (SingletonClass.class){
                if (INSTANCE == null){
                    INSTANCE = new SingletonClass();
                }
            }
        }
        return INSTANCE;
    }
}
