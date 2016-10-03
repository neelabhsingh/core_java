package com.thread;

/**
 * Created by neelabhsingh on 27/09/16.
 */
public class ThreadJoinDemo implements Runnable{
    @Override
    public void run() {
        Thread t =Thread.currentThread();
        System.out.print("Thread name :"+ t.getName());
        System.out.println(", Thread is alive:"+ t.isAlive());
    }
    public static void main(String [] args) throws InterruptedException{
        Thread t1 = new Thread(new ThreadJoinDemo());
        t1.start();
        t1.join(); // If you join thread, then you have to throw Exception or handle.
        Thread t =Thread.currentThread();
        System.out.print("Thread name :"+ t1.getName());
        System.out.println(", Thread is alive:"+ t1.isAlive());
    }
}
