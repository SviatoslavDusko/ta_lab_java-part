package com.epam.lab.hw_9_collections_enum.tree;

import com.epam.lab.hw_9_collections_enum.tree.test_classes.Person;

public class MyTree<T extends Person> {
    private Node root;

    private Node putRecursive(Node node, T t) {
        if (node == null) {
            return new Node(t);
        }

        if (t.getCompareValue().compareTo(node.getValue().getCompareValue()) < 0) {
            node.setLeft(putRecursive(node.getLeft(), t));
        } else if (t.getCompareValue().compareTo(node.getValue().getCompareValue()) > 0) {
            node.setRight(putRecursive(node.getRight(), t));
        } else {
            return node;
        }
        return node;
    }

    public void put(T t) {
        root = putRecursive(root, t);
    }

    private Node removeRecursive(Node node, T t) {
        if (node == null) {
            return null;
        }

        if (t.getCompareValue().compareTo(node.getValue().getCompareValue()) == 0) {
            if (node.getLeft() == null && node.getRight() == null) {
                return null;
            }
            if (node.getRight() == null) {
                return node.getLeft();
            }

            if (node.getLeft() == null) {
                return node.getRight();
            }
            T smallestValue = findSmallestValue(node.getRight());
            node.setValue(smallestValue);
            node.setRight(removeRecursive(node.getRight(), smallestValue));
            return node;
        }
        if (t.getCompareValue().compareTo(node.getValue().getCompareValue()) < 0) {
            node.setLeft(removeRecursive(node.getLeft(), t));
            return node;
        }
        node.setRight(removeRecursive(node.getRight(), t));
        return node;
    }

    public void remove(T t) {
        root = removeRecursive(root, t);
    }

    private T findSmallestValue(Node node) {
        if (node.getLeft() == null) {
            return (T) node.getValue();
        } else {
            findSmallestValue(node.getLeft());
        }
        return null;
    }

    public void print() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "MyTree{" +
                "root=" + root +
                '}';
    }
}
