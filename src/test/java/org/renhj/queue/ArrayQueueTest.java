package org.renhj.queue;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayQueueTest {
    private static final ArrayQueue<String> arrayQueue = new ArrayQueue<>();

    @Test
    public void enqueue() {
        arrayQueue.enqueue("aaa");
        arrayQueue.enqueue("bbb");
        arrayQueue.enqueue("ccc");
        arrayQueue.enqueue("ddd");
        arrayQueue.enqueue("eee");
        arrayQueue.enqueue("fff");
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue);
        arrayQueue.enqueue("ggg");
        arrayQueue.enqueue("hhh");
        arrayQueue.enqueue("iii");
        arrayQueue.enqueue("jjj");
        arrayQueue.dequeue();
        arrayQueue.enqueue("kkk");

        System.out.println(arrayQueue);
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue);
    }

    @Test
    public void dequeue() {
        System.out.println(arrayQueue.dequeue());
    }

    @Test
    public void size() {
    }
}