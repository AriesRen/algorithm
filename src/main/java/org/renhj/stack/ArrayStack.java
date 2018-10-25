package org.renhj.stack;

import java.util.EmptyStackException;

public class ArrayStack<T> implements stack<T> {
    private final Object [] DEFAULT_ARRAY = new Object[10];
    private final int DEFAULT_CAP = 10;
    private Object[] data;
    private int  cap;
    private int size;

    public ArrayStack() {
        this.cap = DEFAULT_CAP;
        this.size = 0;
        this.data = DEFAULT_ARRAY;
    }
    public ArrayStack(int cap){
        if (cap < 0) throw new IllegalArgumentException("Illegal Capacity: "+ cap);
        this.cap = cap;
        this.data = new Object[cap];
    }
    public void push(T val) {
        if (size<cap){
            // 数组满了
            data[size] = val;
            size++;
        }else {
            Object[] objects = new Object[cap*2];
            System.arraycopy(data, 0, objects, 0, size);
            data = objects;
            data[size] = val;
            size ++;
        }
    }
    public T pop() {
        if (size == 0) throw new RuntimeException("EmptyStackException: 栈空");
        T result = (T) data[size-1];
        size--;
        return result;
    }
}
