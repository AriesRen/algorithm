package org.renhj.queue;

/**
 * 基于链表实现的队列
 */
public class LinkedListQueue<T> implements Queue<T>{
    @Override
    public boolean enqueue(T val) {
        return false;
    }

    @Override
    public T dequeue() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
