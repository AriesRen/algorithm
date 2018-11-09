package org.renhj.queue;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircularQueueTest {
    private static final CircularQueue<String> cirQueue = new CircularQueue<>();

    @Test
    public void enqueue() {
        cirQueue.enqueue("aaa");
        cirQueue.enqueue("bbb");
        cirQueue.enqueue("ccc");
        cirQueue.enqueue("ddd");
        cirQueue.enqueue("eee");
        cirQueue.enqueue("fff");
        cirQueue.enqueue("ggg");
        cirQueue.enqueue("hhh");
        cirQueue.enqueue("jjj");
        System.out.println(cirQueue.dequeue());
        System.out.println(cirQueue.dequeue());
        System.out.println(cirQueue.dequeue());
        cirQueue.enqueue("kkk");
        cirQueue.enqueue("lll");
        cirQueue.enqueue("mmm");
        System.out.println(cirQueue);
    }

    @Test
    public void dequeue() {
    }

    @Test
    public void size() {
    }
}