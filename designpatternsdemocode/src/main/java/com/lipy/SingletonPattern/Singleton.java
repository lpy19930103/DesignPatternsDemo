package com.lipy.SingletonPattern;

/**
 * 单例模式,保证一个类仅有一个实例,并提供一个访问它的全局访问点.
 * Created by lipy on 2017/4/21 0021.
 */
class Singleton {

    private static Singleton instance;//懒汉式

//    private static Singleton instance = new Singleton();//饿汉式

    private Singleton() {

    }

    //懒汉式
    static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

//    //饿汉式
//    public static Singleton getInstance() {
//        return instance;
//    }



    //多线程 同步加载
     synchronized static Singleton getSynchronizedInstance1() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    //多线程 多重判断 不让线程每次都加锁,只是在实例违背创建的时候在加锁处理.同时也能保证线程安全.
     static Singleton getSynchronizedInstance2() {
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }


}
