package com.thread;

/**
 * Created by neelabhsingh on 09/10/16.
 * Java thread object invoke start method twice, then it throws IllegalThreadStateException
 */
public class ThreadDemo1  extends Thread{
    @Override
    public void run() {
        System.out.print("Run");
    }

    public static void main(String [] args){
        ThreadDemo1 t1 = new ThreadDemo1();
        t1.start();
        t1.start();//Exception in thread "main" java.lang.IllegalThreadStateException
    }
}
