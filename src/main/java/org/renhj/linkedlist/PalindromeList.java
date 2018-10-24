package org.renhj.linkedlist;

public class PalindromeList {
    public static void main(String[] args) {
        String s = "上海自来水来自海上";
        System.out.println(isPalinkdromeList(s));

    }

    public static boolean isPalinkdromeList(String s){
        SinglyLinkedList<Character> linkedList = new SinglyLinkedList<>();
        for (char c:s.toCharArray()){
            linkedList.push(c);

        }
        System.out.println(linkedList);
        return true;
    }
}
