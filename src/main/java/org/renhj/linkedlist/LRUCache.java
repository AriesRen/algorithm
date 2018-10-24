package org.renhj.linkedlist;

public interface LRUCache<T> {
    void put(T val);

    T get(T val);

    int Size();
}

class ListLRUCache<T> implements LRUCache<T> {
    private SinglyLinkedList<T> lruList;
    private static final int DEFAULT_CAP=10;

    // 缓存容量
    private int cap;
    // 缓存使用大小
    private int size;

    public ListLRUCache(){
        this(DEFAULT_CAP);
    }
    public ListLRUCache(int cap){
        this.cap = cap;
        this.lruList = new SinglyLinkedList<>();
    }

    @Override
    public void put(T value) {
        // 1、缓存满了
        // 如果该列表中没有该数据
        if (size == cap){
            // 1、缓存满了
            // 删除最后一个节点
            lruList.delete(size-1);
            // 将该数据插入到链表头部
            lruList.push(value);
        }else {
            // 2、缓存未满
            // 直接在列表头部插入该数据
            lruList.push(value);
            size++;
        }
    }

    @Override
    public T get(T val) {
        T result = null;
        if (lruList.contains(val)){
            // 在list中,从list中获取该数据
            int index = lruList.indexOf(val);
            result = lruList.get(index);
            System.out.println("从缓存中获取");
            // 将该节点插入到链表头部
            lruList.delete(index);
            lruList.push(val);
        }else{
            // 如果该列表中没有该数据
            System.out.println("缓存中没有该数据！");
            if (size == cap){
                // 1、缓存满了
                // 删除最后一个节点
                lruList.delete(size-1);
                // 将该数据插入到链表头部
                lruList.push(val);
                System.out.println("缓存已满！将该数据插入到缓存");
            }else {
                // 2、缓存未满
                // 直接在列表头部插入该数据
                lruList.push(val);
                size++;
                System.out.println("将该数据直接插入到缓存");
            }
            // 如果有数据库，该数据从数据库中获取
            result = val;
        }

        return result;
    }

    public int Size(){
        return size;
    }
}