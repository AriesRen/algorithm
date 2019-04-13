package org.renhj.queue;

import java.util.LinkedList;

/**
 * 基于链表实现的队列
 */
public class LinkedListQueue<T> implements Queue<T>{

    private int size = 0;
    private int capacity;
    private LinkedList<T> item;

    public LinkedListQueue(){
        this(10);
    }
    public LinkedListQueue(int capacity){
        this.capacity = capacity;
        this.item = new LinkedList<>();
    }

    @Override
    public boolean enqueue(T val) {
        if (size == capacity ){
            throw new IndexOutOfBoundsException("队列满了！");
        }
        item.addLast(val);
        size ++;
        return true;
    }

    @Override
    public T dequeue() {
        if (size == 0){
            throw new IndexOutOfBoundsException("队列为空！");
        }
        T t = item.removeFirst();
        size --;
        return t;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return item.toString();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedListQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }
        System.out.println(queue);
        for (int i = 0; i < 10; i++) {
            System.out.println(queue.dequeue());
        }
    }
}
