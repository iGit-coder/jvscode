package com.example.javase;

import com.example.interfaces.TestInterface;

public class CurrentSynch implements TestInterface{
    // 1. public static volatile boolean stop = false;
    public static  boolean stop = false;
    public  void test(){
       
        Thread b = new Thread("B"){
            public void run(){
                while(!stop){      
                    int a = 1;
                    // 2. System.out.println("a is "+a);
                }
                System.out.println("exit");
            }

        };
        b.start();
        try {
            Thread.sleep(1000L);
        } catch (Exception e) {
            //TODO: handle exception
        }
        /**
         * stop 变量如果是普通静态变量，那么线程b是不会感知主内存中stop的变化的
         * 因为b线程中会有之前的stop缓存，会一直使用缓存中的stop.
         * 解决方式有两种：
         * 1.使用volatile修饰变量，这样每次b线程使用stop时，都会从主内存中获取最新的stop
         * 2.使用同步代码块，这样每次线程b执行完同步代码块时，都会读取主内存中的变量stop
         * 上面System.out.println()会调用具有同步代码块的代码，所以不会出现问题
         * 3.final关键字
         */
        stop = true;
        System.err.println("stop now is +"+stop);
    
    }
}
