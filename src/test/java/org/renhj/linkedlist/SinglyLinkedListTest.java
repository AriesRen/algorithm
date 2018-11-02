package org.renhj.linkedlist;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SinglyLinkedListTest {

    private SingleLinkedList<Integer> slist = new SingleLinkedList<>();
    private LinkedList<?> linkedList = new LinkedList<>();

    @Test
    public void linkLast() {
        slist.add(1);
        Assert.assertEquals(slist.toString(), "[1, 2]");
    }

    @Test
    public void getFirst() {
        slist.add(1);
        slist.add(2);
        System.out.println(slist.getFirst().intValue());
        Assert.assertEquals(slist.getFirst().intValue(), 1);
    }

    @Test
    public void getLast() {
        slist.add(1);
        slist.add(2);
        System.out.println(slist.getLast().intValue());
        Assert.assertEquals(slist.getLast().intValue(), 2);
    }

    @Test
    public void add() {
        slist.add(1);
        slist.add(2);
        System.out.println(slist);
        Assert.assertEquals(slist.toString(), "[1, 2]");
    }

    @Test
    public void push() {
        slist.push(1);
        slist.push(2);
        System.out.println(slist);
        Assert.assertEquals(slist.toString(),  "[2, 1]");
    }

    @Test
    public void get() {
        slist.push(1);
        slist.push(2);
        Assert.assertEquals(slist.get(0).intValue(), 2);
        Assert.assertEquals(slist.get(1).intValue(), 1);
        try {
            slist.get(2);
            Assert.fail("Expected an IndexOutOfBoundsException to be thrown");
        }catch (IndexOutOfBoundsException ex){
            Assert.assertThat(ex.getMessage(), is("Index: 2, Size: 2"));
        }
    }

    @Test
    public void insert() {
        slist.add(1);
        slist.add(2);
        System.out.println(slist);
    }

    @Test
    public void add1() {
        slist.add(1);
        slist.add(2);
        slist.add(0, 3);
        System.out.println(slist);
    }


    @Test
    public void pop() {
        slist.add(1);
        slist.add(2);
        System.out.println(slist);
        Assert.assertEquals(slist.pop().intValue(), 1);
        System.out.println(slist);
        slist.push(3);
        System.out.println(slist);
        Assert.assertEquals(slist.pop().intValue(), 3);
        slist.pop();
        System.out.println(slist);
    }

    @Test
    public void size() {
        System.out.println(slist.size());
        slist.push(1);
        slist.push(2);
        Assert.assertEquals(slist.size(), 2);
    }

    @Test
    public void delete(){
        SingleLinkedList<String> slist = new SingleLinkedList<>();
        slist.add("1");
        slist.add("2");
        slist.add("3");
        System.out.println(slist);
        String d = slist.delete("3");
        System.out.println(d);
        System.out.println(slist);
    }

    @Test
    public void indexOf(){
        slist.add(1);
        slist.add(2);
        slist.add(3);
        System.out.println(slist);
        System.out.println("index = "+ slist.indexOf(4));
    }

    @Test
    public void reverse(){
        slist.add(1);
        slist.add(2);
        slist.add(3);
        System.out.println(slist);
        slist.reverse();
        System.out.println(slist);
    }


}