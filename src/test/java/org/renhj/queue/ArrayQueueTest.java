package org.renhj.queue;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayQueueTest {
    private ArrayQueue<String> arrayQueue = new ArrayQueue<>();

    @Test
    public void enqueue() {
        arrayQueue.enqueue("aaa");
        arrayQueue.enqueue("bbb");
        arrayQueue.enqueue("ccc");
        System.out.println(arrayQueue.dequeue());
    }

    @Test
    public void dequeue() {
    }

    @Test
    public void size() {
    }
}