package com.epam.lab.hw_9_collections_enum.tree_map;

import com.epam.lab.hw_9_collections_enum.tree_map.test_classes.Person;

import java.util.Comparator;

public class MyTree<T extends Person> {
//    public MyTree(Comparator<?super Person> comparator) {
//    }

    private Node root;

    private Node addRecursive(Node node, T t) {
//        Comparable<Person> key = (Comparable<Person>) t;
////        key.compareTo()
        if (node == null) {
            return new Node(t);
        }

        if (t.getCompareValue().compareTo(node.getValue().getCompareValue()) < 0) {
            node.setLeft(addRecursive(node.getLeft(), t));
        } else if (t.getCompareValue().compareTo(node.getValue().getCompareValue()) > 0) {
            node.setRight(addRecursive(node.getRight(), t));
        } else {
            return node;
        }
        return node;
    }

    public void add(T t) {
        root = addRecursive(root, t);
    }

    private Node deleteRecursive(Node node, T t) {
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
            node.setRight(deleteRecursive(node.getRight(), smallestValue));
            return node;
        }
        if (t.getCompareValue().compareTo(node.getValue().getCompareValue()) < 0) {
            node.setLeft(deleteRecursive(node.getLeft(), t));
            return node;
        }
        node.setRight(deleteRecursive(node.getRight(), t));
        return node;
    }

    public void delete(T t) {
        root = deleteRecursive(root, t);
    }

    private T findSmallestValue(Node node) {
        if (node.getLeft() == null) {
            return (T) node.getValue();
        } else {
            findSmallestValue(node.getLeft());
        }
        return null;
    }

    public void printTree() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "MyTree{" +
                "root=" + root +
                '}';
    }
}
