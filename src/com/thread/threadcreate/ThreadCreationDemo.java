package com.thread.threadcreate;

/**
 * Created by neelabhsingh on 20/11/16.
 */
public class ThreadCreationDemo{
    public static void main(String [] args){
        Thread t1 = new Thread(new RunnableThread());
        t1.start();
        MyThread t2= new MyThread("My thread");
        t2.start();
    }
}

class RunnableThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Start Database Processing");
        try{
            Thread.sleep(1000);

        }catch (InterruptedException E){
            E.printStackTrace();
        }
        System.out.println("Done with Database Process");
    }
    private void doDatabaseProcess() throws InterruptedException{
        Thread.sleep(10000);
    }
}

class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    @Override
    public void run() {
        System.out.println("MyThread start"+ Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        }catch (InterruptedException E){

        }
    }
    public void dbProcessing() throws InterruptedException{
        Thread.sleep(1000);
    }
}