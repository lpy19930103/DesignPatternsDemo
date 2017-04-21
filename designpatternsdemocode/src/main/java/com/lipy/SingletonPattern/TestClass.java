package com.lipy.SingletonPattern;

public class TestClass {
    public static void main(String[] args) {
        testSynchronizedInstance();
        testSingleton();
    }

    private static void testSingleton() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        if (instance1 == instance2) {
            System.out.println("instance1 和 instance2 是相同的实例");
        }
    }

    private static void testSynchronizedInstance() {
        SingletonRunable singletonRunable = new SingletonRunable();

        for (int i = 0; i < 5; i++) {
            new Thread(singletonRunable).start();

        }
    }

    public static class SingletonRunable implements Runnable {
        @Override
        public void run() {
            Singleton synchronizedInstance2 = Singleton.getSynchronizedInstance2();
            System.out.println("synchronizedInstance2 = " + synchronizedInstance2.toString());
        }
    }
}
