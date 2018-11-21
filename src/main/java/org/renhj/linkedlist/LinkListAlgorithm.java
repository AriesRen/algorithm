package org.renhj.linkedlist;

import org.omg.PortableInterceptor.INACTIVE;

/**
 * 链表的一些算法题目
 */
public class LinkListAlgorithm {
    public static void main(String[] args) {
        // 第一个链表，检测是否有环
        System.out.println("链表中环的检测");
        Node<Integer> n1 = new Node<>(1);
        Node<Integer> n2 = new Node<>(2);
        Node<Integer> n3 = new Node<>(3);
        n1.next = n2;
        n2.next = n3;
        n3.next = n1; // 1->2->3->1
        System.out.println(isLoop(n1)); // true
        System.out.println("==========================================");
        // 链表反转
        System.out.println("链表反转");
        Node<Integer> n4 = new Node<>(4);
        Node<Integer> n5 = new Node<>(5);
        Node<Integer> n6 = new Node<>(6);
        Node<Integer> n7 = new Node<>(7);
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        System.out.println(printLinkList(n4)); // 4->5->6->7
        Node<Integer> head = reverse(n4);
        System.out.println(printLinkList(head)); // 7->6->5->4
        System.out.println("==========================================");

        // 求链表的中间节点
        System.out.println("求链表的中间节点");
        Node<Integer> n8 = new Node<>(8);
        Node<Integer> n9 = new Node<>(9);
        Node<Integer> n10 = new Node<>(10);
        Node<Integer> n11 = new Node<>(11);
        Node<Integer> n12 = new Node<>(12);
        n8.next = n9;
        n9.next = n10;
        n10.next = n11;
        n11.next = n12; // 8->9->10->11->12
        System.out.println(printLinkList(n8));
        Node<Integer> mid = middle(n8);
        System.out.println("中间节点是： " + mid.val);  // 10
        System.out.println("==========================================");

        // 有序链表合并
        System.out.println("有序链表合并");
        Node<Integer> n13 = new Node<>(13);
        Node<Integer> n14 = new Node<>(14);
        Node<Integer> n15 = new Node<>(15);
        n13.next = n14;
        n14.next = n15;
        System.out.println("第一个链表： "+printLinkList(n8));
        System.out.println("第二个链表： "+printLinkList(n13));
        head = merge(n8, n13);
        System.out.println("合并后的链表： "+printLinkList(head));

        System.out.println("==========================================");
        // 删除倒数第2个节点
        Node<Integer> n16 = new Node<>(16);
        Node<Integer> n17 = new Node<>(17);
        Node<Integer> n18 = new Node<>(18);
        Node<Integer> n19 = new Node<>(19);
        n16.next = n17;
        n17.next = n18;
        n18.next = n19;
        System.out.println("删除前： "+printLinkList(n16));
        head = deleteLastKDesc(n16, 3);
        System.out.println("删除后： "+printLinkList(n16));
    }

    /** 合并两个有序链表 */
    private static Node<Integer> merge(Node<Integer> n1, Node<Integer> n2) {
        // 确定新链表头结点
        Node<Integer> head, p = n1, q = n2;
        if (p.val > q.val){
            head = n2;
            q = q.next;
        }else{
            head = n1;
            p = p.next;
        }
        Node<Integer> r = head;
        while (p!=null &&q!=null){
            if (p.val < q.val){
                r.next = p;
                p = p.next;
            }else {
                r.next = q;
                q = q.next;
            }
            r = r.next;
        }
        if (p!=null){
            r.next = p;
        }else{
            r.next = q;
        };
        return head;
    }

    /**查找链表中间节点*/
    private static Node<Integer> middle(Node<Integer> head) {
        if (head==null) return null;
        Node<Integer> p = head;
        Node<Integer> q = head;
        while (q.next !=null && q.next.next!=null){
            q = q.next.next;
            p = p.next;
        }
        return p;
    }

    /** 链表中环的检测*/
    private static boolean isLoop(Node<Integer> head){
        // 采用快慢指针法 如果两个指针相遇，则说明有环
        Node<Integer> p = head;
        Node<Integer> q = head.next.next;
        while (q!=null){
            p = p.next;
            q = q.next.next;
            if (q == p){
                return true;
            }
        }
        return false;
    }
    /**反转链表*/
    private static Node<Integer> reverse(Node<Integer> head){
        if (head.next == null)return head;
        Node<Integer> p;
        Node<Integer> q;
        Node<Integer> r;
        p = head;
        q = p.next;
        p.next = null;
        while (q != null){
            r = q.next;
            q.next = p;
            p = q;
            q = r;
        }
        return p;
    }

    /**删除链表倒数第K个结点*/
    private static Node<Integer> deleteLastKDesc(Node<Integer> head, int k){
        if (head == null || k <0) return null;
        Node<Integer> p = head;

        while (p != null){
            p = p.next;
            k--;
        }
        if (k == 0){
            return head.next;
        }

        if (k < 0){
            p = head;
            while (++k != 0){
                p = p.next;
            }
            p.next = p.next.next;
        }
        return p;
    }


    private static class Node<E> {
        E val;
        Node<E> next;
        Node(E e){
            this.val = e;
        }
    }
    private static String printLinkList(Node<Integer> head){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (head !=null){
            if (head.next !=null)
                sb.append(head.val).append(", ");
            else
                sb.append(head.val);
            head = head.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
