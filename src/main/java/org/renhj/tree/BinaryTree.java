package org.renhj.tree;


public class BinaryTree {
    public static void main(String[] args) {
        Node<Integer> root = new Node<>(1);
        Node<Integer> n1 = new Node<>(2);
        Node<Integer> n2 = new Node<>(3);
        Node<Integer> n3 = new Node<>(4);
        Node<Integer> n4 = new Node<>(5);
        Node<Integer> n5 = new Node<>(6);

        root.left = n1;
        root.right = n2;
        n1.left = n3;
        n1.right = n4;
        n2.left = n5;

        System.out.println("前序遍历：");
        preOrder(root);
        System.out.println();
        System.out.println("后序遍历：");
        postOrder(root);
        System.out.println();
        System.out.println("中序遍历：");
        midOrder(root);

    }

    // 前序遍历
    private static <T> void preOrder(Node<T> root) {
        if (root == null) return;
        System.out.print(root.data + ", ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // 后序遍历
    private static <T> void postOrder(Node<T> root){
        if (root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + ", ");
    }

    // 中序遍历
    private static <T> void midOrder(Node<T> root) {
        if (root == null) return;
        midOrder(root.left);
        System.out.print(root.data + ", ");
        midOrder(root.right);
    }

    public static class Node<T>{
        private T data;
        private Node<T> left;
        private Node<T> right;

        Node(T t){
            this.data = t;
        }
    }
}
