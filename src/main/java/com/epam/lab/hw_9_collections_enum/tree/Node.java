package com.epam.lab.hw_9_collections_enum.tree;

import com.epam.lab.hw_9_collections_enum.tree.test_classes.Person;

public class Node<T extends Person> {
    private T value;
    private Node left;
    private Node right;

    public Node(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node\n{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                "}";
    }
}
