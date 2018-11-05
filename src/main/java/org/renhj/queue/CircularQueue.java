package org.renhj.queue;

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
        return true;
    }

    public T dequeue(){
       return null;
    }

    @Override
    public int size() {
        return size;
    }
}
