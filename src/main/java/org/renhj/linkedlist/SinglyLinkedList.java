package org.renhj.linkedlist;

import java.util.NoSuchElementException;

public class SinglyLinkedList<T>{
    private Node<T> head;
    private int size;

    public SinglyLinkedList(){
        this.head = new Node<>(null);
    }

    // 链表头部插入值
    private void linkFirst(Node<T> newNode){
        newNode.next = head.next;
        head.next = newNode;
        size++;
    }
    // 链表尾部插入值
    public void linkLast(T val){
        Node<T> newNode = new Node<>(val);
        linkLast(newNode);
    }
    private void linkLast(Node<T> newNode){
        Node<T> p = head;
        while (p.next!=null){
            p=p.next;
        }
        p.next = newNode;
        size++;
    }
    // 获取头部值
    public T getFirst(){
        if (head.next == null){
            throw new NoSuchElementException();
        }
        return head.next.val;
    }
    // 获取尾部值
    public T getLast(){
        Node<T> p = head.next;
        while (p.next!=null){
            p = p.next;
        }
        return p.val;
    }
    // 添加
    public void add(T val){
        Node<T> newNode = new Node<>(val);
        linkLast(newNode);
    }
    // 在某处索引插入
    public void add(int index, T val){
        Node<T> newNode = new Node<>(val);
        Node<T> p = node(index);
        insert(p, newNode);
    }
    private void insert(Node<T> p, Node<T> newNode){
        Node<T> q = head;
        while (q!=null && q.next!=p){
            q = q.next;
        }
        if (q == null){
            return;
        }
        newNode.next = p;
        q.next = newNode;
    }

    // 根据值删除某个节点
    public boolean delete(T val){
        Node<T> p = head;
        while (p.next !=null && !p.next.val.equals(val)){
            p = p.next;
        }
        if (p.next== null){
            return false;
        }
        p.next = p.next.next;
        return true;
    }
    // 根据索引删除某结点
    public boolean delete(int index){
        Node<T> deleteNode = node(index);
        return deleteNode(deleteNode);
    }
    private boolean deleteNode(Node<T> deleteNode){
        Node<T> p = head;
        while (p.next!= null && p.next != deleteNode){
            p = p.next;
        }
        if (p.next == null){
            return true;
        }
        p.next = deleteNode.next;
        return true;
    }

    // 根据索引获取值
    public T get(int index){
        if (index >= size || index < 0){
            throw new IndexOutOfBoundsException("Index: "+index + ", Size: "+size);
        }
        return node(index).val;
    }

    // 通过value 查找对应的索引
    public int indexOf(T val){
        int index = 0;
        Node<T> p = head;
        while (p.next !=null && p.next.val!=val){
            p = p.next;
            index ++;
        }
        if (p.next == null){
            index = -1;
        }
        return index;
    }
    public boolean contains(T val){
        Node<T> p = head;
        while (p.next !=null && p.next.val!=val){
            p = p.next;
        }
        return p.next != null;
    }

    private Node<T> node(int index){
        if (index >= size || index < 0){
            throw new IndexOutOfBoundsException("Index: "+index + ", Size: "+size);
        }
        Node<T> p = head.next;
        int i=0;
        while (i<size){
            if (i == index){ break; }
            p = p.next;
            ++i;
        }
        return p;
    }
    public void push(T val){
        Node<T> newNode = new Node<>(val);
        linkFirst(newNode);
    }
    public T pop(){
        if (head.next!= null){
            return head.next.val;
        }
        return null;
    }

    public int size(){
        return size;
    }

    // 打印链表 example: [1, 2, 3]
    @Override
    public String toString() {
        if (head.next == null){
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<T> p = head.next;
        while (p.next!=null){
            sb.append(p.val).append(", ");
            p = p.next;
        }
        sb.append(p.val).append("]");
        return sb.toString();
    }

    public static class Node<T>{
        private T val;
        private Node<T> next;
        Node(T val){
            this.val = val;
        }
    }
}