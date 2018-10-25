package org.renhj.linkedlist;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;

public class LinkedListUtilTest {

    @Test
    public void test(){
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        LinkedListUtil.reverse(linkedList);
        System.out.println(linkedList); // [3, 2, 1]
    }

}