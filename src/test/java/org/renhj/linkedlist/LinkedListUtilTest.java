package org.renhj.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListUtilTest {

    @Test
    public void test(){
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.push("12");
        LinkedListUtil.reverse(linkedList);
        System.out.println(linkedList);
    }

}