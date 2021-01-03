package com.tianshu.singleton.v6;

/**
 * 枚举单例:不仅可以实现单例,可以防止反序列化
 * 使用枚举来代替静态内部类
 */
public class SingletonClass {
    private SingletonClass(){}

    enum SingletonEnum{
        INSTANCE;
        private SingletonClass singletonClass;
        SingletonEnum(){
            singletonClass = new SingletonClass();
        }
        public SingletonClass getInstance(){
            return singletonClass;
        }

    }

    public SingletonClass getInstance(){
        return SingletonEnum.INSTANCE.getInstance();
    }

}
