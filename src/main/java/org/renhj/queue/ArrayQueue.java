package org.renhj.queue;

import java.util.Arrays;

/**
 * 基于数组实现的队列
 */
public class ArrayQueue<T> implements Queue<T> {
    // 数组items
    private Object[] items;
    // 队列大小
    private int size=0;
    private int capacity;
    // head表示队头下标，tail表示队尾下标
    private int head=0;
    private int tail=0;

    public ArrayQueue(){
        this(10); // 队列默认容量给10
    }
    public ArrayQueue(int capacity){
        this.items = new Object[capacity];
        this.capacity = capacity;
    }

    @Override
    public boolean enqueue(T val){
        if(size == capacity){
            throw new RuntimeException("队列满了!");
        } // 队列满了
        if (tail == capacity && size < capacity){
            for (int i=head; i< tail; i++){
                items[i-head] = items[i];
            }
            head = 0;
            tail = size;
        }
        items[tail] = val;
        size ++;
        tail ++;
        return true;
    }
    @Override
    public T dequeue(){
        if (size == 0) {
            return null;
        }
        T res = (T)items[head];
        items[head] = null;
        head++;
        size--;
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
