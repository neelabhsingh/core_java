package com.thread;

/**
 * Created by neelabhsingh on 28/09/16.
 */
public class SynchronizeMethodDemo {
    private int balance =0;
    public static void main(String [] args){
        SynchronizeMethodDemo smd = new SynchronizeMethodDemo();
        smd.runThread();
    }
    public void runThread(){
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i=0;i<100000;i++){
                    add();
                }
            }
        });
        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i=0;i<100000;i++){
                    subtract();
                }
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }catch (InterruptedException E){
            E.printStackTrace();
        }
        System.out.print("Balance = "+ balance);
    }
    public synchronized void add(){
        balance++;
    }
    public synchronized void subtract(){
        balance--;
    }
}
