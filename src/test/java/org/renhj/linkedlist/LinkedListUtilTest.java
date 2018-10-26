package org.renhj.linkedlist;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;

import java.util.LinkedList;

public class LinkedListUtilTest {

    @Test
    public void test(){
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println("反转前linkedlist："+linkedList);


        SinglyLinkedList<Integer> newList = LinkedListUtil.reverse(linkedList);
        System.out.println(linkedList);
        System.out.println(newList); // [3, 2, 1]
    }
    @Test
    public void test1(){
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.remove("3");
        linkedList.pop();

    }
}