package com.patterns.patterns.java.thread;

public class ThreadLock {
    public  synchronized void thread1(){
        System.out.println("thread 1 before synchronised");
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("thread 1 after sync");
    }

    public void thread2(){
        System.out.println("thread 2 before sync function");
        synchronized (this){
            System.out.println("thread 2 after sync");
        }
    }
}
