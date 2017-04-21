package com.lipy.SingletonPattern;

/**
 * ����ģʽ,��֤һ�������һ��ʵ��,���ṩһ����������ȫ�ַ��ʵ�.
 * Created by lipy on 2017/4/21 0021.
 */
class Singleton {

    private static Singleton instance;//����ʽ

//    private static Singleton instance = new Singleton();//����ʽ

    private Singleton() {

    }

    //����ʽ
    static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

//    //����ʽ
//    public static Singleton getInstance() {
//        return instance;
//    }



    //���߳� ͬ������
     synchronized static Singleton getSynchronizedInstance1() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    //���߳� �����ж� �����߳�ÿ�ζ�����,ֻ����ʵ��Υ��������ʱ���ڼ�������.ͬʱҲ�ܱ�֤�̰߳�ȫ.
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
