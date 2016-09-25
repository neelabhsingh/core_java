package com.thread;

import java.util.PrimitiveIterator;
import java.util.concurrent.ThreadFactory;

/**
 * Created by neelabhsingh on 25/09/16.
 */
public class WaitNotifyDemo {
    public static void main(String [] args){
        Message msg = new Message("Process It");
        Waiter waiter1 = new Waiter(msg);
        new Thread(waiter1, "Waiter1 Thread").start();

        Notifier notifier = new Notifier(msg);
        new Thread(notifier, "Notifier Thread").start();
    }
}

class Message{
    private String msg;
    public Message(String msg){
        this.msg = msg;
    }
    public String getMsg(){
        return this.msg;
    }
    public void setMsg(String msg){
        this.msg = msg;
    }
}
class Waiter implements Runnable {
    private Message msg;
    public Waiter(Message msg){
        this.msg =msg;
    }
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized (msg){
            try{
                System.out.println(name+ ", Waiting for thread to get notify "+ System.currentTimeMillis());
                msg.wait();
            }catch (InterruptedException E){
                E.printStackTrace();
            }
            System.out.println(name+" Waiter thread got Notify at "+ System.currentTimeMillis());
            System.out.println(name+" processed: "+ msg.getMsg());
        }
    }
}

class Notifier implements Runnable{
    private Message msg;
    public Notifier(Message msg){
        this.msg = msg;
    }
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " started");
        try{
            Thread.sleep(10000);
            synchronized (msg){
                msg.setMsg(name+" notify that work is done");
                msg.notify();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}