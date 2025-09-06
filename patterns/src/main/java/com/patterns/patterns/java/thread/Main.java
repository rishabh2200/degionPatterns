package com.patterns.patterns.java.thread;

public class Main {
    public static void main(String args[]){
//        FirstThread firstThread = new FirstThread();
//        Thread thread = new Thread(firstThread);
//        thread.start();
        ThreadLock threadLock = new ThreadLock();
        Thread thread1 = new Thread(()->{threadLock.thread1();});
        Thread thread2 = new Thread(()->{threadLock.thread2();});
        thread1.start();
        thread2.start();
    }
}
