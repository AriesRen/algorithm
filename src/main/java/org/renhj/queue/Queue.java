package org.renhj.queue;

public interface Queue<T> {
    // 入队
    boolean enqueue(T val);
    // 出队
    T dequeue();
    // 大小
    int size();
}
