package org.renhj.linkedlist;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListUtil {

    /**
     * 1、链表反转
     * 2、链表中环的检测
     * 3、两个有序链表合并
     * 4、删除链表倒数第几个节点
     * 5、求链表的中间节点
     */

    public static <T> SingleLinkedList<T> reverse(SingleLinkedList<T> original){
        SingleLinkedList<T> linkedList = new SingleLinkedList<T>();
        int size = original.size();
        for (int i=0; i<size;i++){
            linkedList.push(original.pop());
        }
        return linkedList;
    }

    public static <T>  boolean checkCircle(SingleLinkedList<T>  linkedList){
        return true;
    }

    public static <T>  SingleLinkedList<T> merageList(SingleLinkedList<T> l1,SingleLinkedList<T> l2){
        return new SingleLinkedList<>();
    }

    public static <T>  void deleteLastKth(SingleLinkedList<T> linkedList, T val){

    }

    public static <T>  int getMiddle(SingleLinkedList<T> linkedList){
        return 0;
    }
}
