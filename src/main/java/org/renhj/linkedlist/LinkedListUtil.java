package org.renhj.linkedlist;

public class LinkedListUtil {

    /**
     * 1、链表反转
     * 2、链表中环的检测
     * 3、两个有序链表合并
     * 4、删除链表倒数第几个节点
     * 5、求链表的中间节点
     */

    public static <T> void reverse(SinglyLinkedList<T> list){
        System.out.println(list);

    }

    public static <T>  boolean checkCircle(SinglyLinkedList<T>  linkedList){
        return true;
    }

    public static <T>  SinglyLinkedList<T> merageList(SinglyLinkedList<T> l1,SinglyLinkedList<T> l2){
        return new SinglyLinkedList<>();
    }

    public static <T>  void deleteLastKth(SinglyLinkedList<T> linkedList, T val){

    }

    public static <T>  int getMiddle(SinglyLinkedList<T> linkedList){
        return 0;
    }
}
