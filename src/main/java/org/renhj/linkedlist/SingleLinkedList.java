package org.renhj.linkedlist;

import java.util.NoSuchElementException;

public class SingleLinkedList<T>{
    private Node<T> head;
    private int size;

    public SingleLinkedList(){
        this.head = new Node<T>(null);
    }

    public void add(T val){
        // 向尾部插入一个结点
        Node<T> newNode = new Node<T>(val);
        linkLast(newNode);
    }
    public void add(int index, T val){
        // 向尾部插入一个结点
        Node<T> newNode = new Node<T>(val);
        linkLast(newNode);
    }
    public T get(int index){
        // 根据索引获取结点值
        return node(index).val;
    }
    public T getFirst(){
        if (head.next ==null){return null;}
        return head.next.val;
    }
    public T getLast(){
        if (head.next ==null){return null;}
        return node(size-1).val;
    }
    public int indexOf(T val){
        return -1;
    }
    public void push(T val){
        push(new Node<T>(val));
    }
    private void push(Node<T> node){
        // 头部插入一个结点
    }
    public T pop(){
        // 从头部取出一个结点，删除该节点，返回该节点值
        return delete(head.next);
    }
    public T delete(T val){
        // 根据值删除结点
        Node<T> node = new Node<T>(val);
        return delete(node);
    }
    public boolean contains(T val){
        return false;
    }
    public T delete(Node<T> node){
        // 删除结点
        T element = node.val;
        Node<T> p = head;
        while(p.next != null && p.next.val != node.val){
            p = p.next;
        }
        if(p.next == null){
            return null;
        }
        p.next = p.next.next;
        size--;
        return element;
    }
    public int size(){
        return size;
    }

    public void reverse(){
        // 反转单链表
        if (head.next == null) {
            return ;
        }
        Node<T> p, q, r;
        p = head.next;
        q = p.next;
        p.next = null;
        while(q!=null){
            r = q.next;
            q.next = p;
            p = q;
            q = r;
        }
        head.next = p;
    }
    // 链表中环的检测
    public boolean hasLoop(){
        if (head.next == null) {
            return false;
        }
        Node<T> p,q;
        p = head.next;
        q = p;
        while(q!=null){
            p = p.next;
            q = q.next.next;

            if (q == p) {
                return true;  // p和q相遇，说明有环了
            }
        }
        return false;// 走到尾部，说明没有环
    }

    public static void merage(){}

    private static class Node<T> {
        T val;
        Node<T> next;
        Node(T val){
            this.val = val;
        }
    }

    public void linkLast(Node<T> newNode){
        Node<T> p = head;
        while(p.next != null){
            p = p.next;
        }
        p.next = newNode;
        size++;
    }
    private Node<T> node(int index){
        if (index < 0 || index >=size) {
            throw new RuntimeException("越界!");
        }
        Node<T> p = head.next;
        int i = 0;
        while(p.next!=null && i!=index){
            p = p.next;
            i++;
        }
        return p;
    }

    @Override
    public String toString(){
        if (head.next == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<T> p = head.next;
        while(p.next != null){
            sb.append(p.val).append(", ");
            p = p.next;
        }
        sb.append(p.val).append("]");
        return sb.toString();
    }

    public static void  main(String[] args){
        SingleLinkedList<String> sl = new SingleLinkedList<>();

        sl.add("1");
        sl.add("2");
        sl.add("3");
        System.out.println(sl); // [1, 2, 3]
        System.out.println(sl.get(0));// 1

        sl.delete("3");
        System.out.println(sl); // [1, 2]
        sl.add("3");

        sl.reverse();
        System.out.println("第一次反转后："+sl); // [3, 2, 1]
        sl.reverse();
        System.out.println("第二次反转后："+sl); // [1, 2, 3]

        System.out.println(sl.pop());  // 1
        System.out.println(sl.pop());  // 2
        System.out.println(sl.pop());  // 3
        // System.out.println(sl.pop());  // null

        Node<String> n1 = new Node<String>("4");
        Node<String> n2 = new Node<String>("5");
        Node<String> n3 = new Node<String>("6");

        n1.next = n2;
        n2.next = n3;
        n3.next = n1;
        sl.linkLast(n1);
        System.out.println(sl.hasLoop());  // true

    }

}