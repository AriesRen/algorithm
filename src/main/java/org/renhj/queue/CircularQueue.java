package org.renhj.queue;

import java.util.Arrays;

public class CircularQueue<T> implements Queue<T> {
    // 数组items
    private Object[] items;
    // 队列大小
    private int size=0;
    private int capacity;
    // head表示队头下标，tail表示队尾下标
    private int head=0;
    private int tail=0;

    public CircularQueue(){
        this(10); // 队列默认容量给10
    }
    public CircularQueue(int capacity){
        this.items = new Object[capacity];
        this.capacity = capacity;
    }

    public boolean enqueue(T val){
        if ((tail+1)%capacity == head){
            throw new RuntimeException("循环队列满了！");
        }
        items[tail] = val;
        tail = (tail+1)%capacity;
        size ++;
        return true;
    }

    public T dequeue(){
       if (size<=0){
           throw new RuntimeException("空队列！");
       }
       T res = (T) items[head];
       size--;
       head = (head+1)%capacity;
       return res;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }

    @Override
    public int size() {
        return size;
    }
}
