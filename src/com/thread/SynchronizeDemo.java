package com.thread;

/**
 * Created by neelabhsingh on 27/09/16.
 */
class Visit{
    public static long visit =0;
}
public class SynchronizeDemo extends  Thread {
    public static void main(String [] args){
        for(int i=0;i<10;i++){
            Thread t = new SynchronizeDemo();
            t.start();
        }
    }

    @Override
    public void run() {
        synchronized (Visit.class) {
            Visit.visit++;
            System.out.print(Visit.visit + " ");
        }
    }
}
