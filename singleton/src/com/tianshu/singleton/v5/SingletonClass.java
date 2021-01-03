package com.tianshu.singleton.v5;

/**
 * 使用静态内部类来初始化 单例
 * 由java虚拟机来保证线程安全,每个类只会被加载一次
 */
public class SingletonClass {

    private SingletonClass(){}

    public static SingletonClass getInstance() {
        return SubClass.INSTANCE;
    }

    private static class SubClass{
        private static final SingletonClass INSTANCE = new SingletonClass();
    }

}
