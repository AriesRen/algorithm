package org.renhj.stack;

import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

public class stackTest {
    private ArrayStack<String> stack = new ArrayStack<>(5);

    @Test
    public void push() {
        stack.push("stack1");
        stack.push("stack2");
        stack.push("stack3");
        stack.push("stack4");
        stack.push("stack5");
        stack.push("stack6");
        stack.push("stack7");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

    @Test
    public void pop() {
    }

    @Test
    public void test(){
        Stack<String> stack = new Stack<String>();
        stack.push("stack");
        System.out.println(stack.pop());
    }
}