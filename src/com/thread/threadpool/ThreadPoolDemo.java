package com.thread.threadpool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by neelabhsingh on 20/11/16.
 */
public class ThreadPoolDemo {
    public static void main(String [] args){
        ExecutorService executorService= Executors.newFixedThreadPool(5);
        for(int i=0; i<10; i++){
            Runnable worker = new WorkerThread(""+i);
            executorService.execute(worker);
        }
    }
}

class WorkerThread implements Runnable{
    private String message;
    public WorkerThread(String message){
        this.message = message;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"(Start) message"+ message);
        processMessage();
        System.out.println(Thread.currentThread().getName()+"(End)");
    }
    private void processMessage(){
        try {
            Thread.sleep(1000);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}