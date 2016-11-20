package com.thread.concurrent;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Created by neelabhsingh on 20/11/16.
 */
public class ProducerConsumerWithWaitNotify {
    public static void main(String [] args){
        Queue<Integer> buffer = new LinkedList<>();
        int maxSize =10;
        Thread producer = new Producer("Producer", buffer, maxSize);
        Thread consumer = new Consumer("Consumer", buffer, maxSize);
        producer.start();
        consumer.start();
    }
}
class Producer extends Thread{
    private Queue<Integer> buffer;
    int maxSize;
    public Producer(String name, Queue<Integer> buffer, int maxSize){
        super(name);
        this.buffer = buffer;
        this.maxSize = maxSize;
    }
    @Override
    public void run() {
        while (true){
            synchronized (buffer){
                while (buffer.size()==maxSize){
                    try {
                        System.out.println("Queue is FULL");
                        buffer.wait();
                    }catch (Exception ex){
                        ex.printStackTrace();
                    }
                }
                Random random = new Random();
                int item = random.nextInt();
                System.out.println("Produce item "+ item);
                buffer.add(item);
                buffer.notifyAll();
            }
        }

    }
}
class Consumer extends Thread{
    private Queue<Integer> buffer;
    private int maxSize;
    public Consumer(String name, Queue<Integer> buffer, int maxSize){
        super(name);
        this.buffer = buffer;
        this.maxSize = maxSize;
    }
    @Override
    public void run() {
        while (true){
            synchronized (buffer){
                while (buffer.isEmpty()){
                    try {
                        System.out.println("Queue is Empty");
                        buffer.wait();
                    }catch (Exception ex){
                        ex.printStackTrace();
                    }
                }
                System.out.println("Consume the value "+ buffer.remove());
                buffer.notifyAll();
            }
        }
    }
}