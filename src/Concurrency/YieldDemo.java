package Concurrency;

import java.util.function.Consumer;

/**
 * Created by neelabhsingh on 03/11/16.
 */
class ProducerA extends Thread{
    @Override
    public void run() {
        for(int i =0;i< 5;i++){
            System.out.println("I am producer. I am producing");
            Thread.yield();
        }
    }
}
class ConsumerB extends Thread{
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("I am consumer. I am consuming");
            Thread.yield();
        }
    }
}
public class YieldDemo {
    public static void main(String [] args){
        ProducerA a = new ProducerA();
        ConsumerB b = new ConsumerB();
        a.setPriority(Thread.MAX_PRIORITY);
        b.setPriority(Thread.MAX_PRIORITY);
        a.start();
        b.start();
    }
}
