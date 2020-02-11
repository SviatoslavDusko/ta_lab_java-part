package com.epam.lab.hw_9_collections_enum.tree_map;

import com.epam.lab.hw_9_collections_enum.tree_map.test_classes.AbstractCompareTo;
import com.epam.lab.hw_9_collections_enum.tree_map.test_classes.CompareToValue;
import com.epam.lab.hw_9_collections_enum.tree_map.test_classes.Person;

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

    public Node getRight() {
        return right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
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
