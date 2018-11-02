package org.renhj.queue;

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

    public boolean enqueue(T val){
        if(size == capacity){return false;} // 队列满了
        items[tail] = val;
        size ++;
        tail ++;
        return true;
    }

    public T dequeue(){
        if (size == 0) {
            return null;
        }
        T res = (T)items[head];
        head++;
        size--;
        return res;
    }
}
