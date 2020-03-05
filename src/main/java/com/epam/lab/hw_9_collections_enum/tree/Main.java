package com.epam.lab.hw_9_collections_enum.tree;

import com.epam.lab.hw_9_collections_enum.tree.test_classes.Person;
import com.epam.lab.hw_9_collections_enum.tree.test_classes.Student;

public class Main {
    public static void main(String[] args) {
        MyTree<Person> myTree = new MyTree<>();

        myTree.put(new Person("Oles", "Dusko"));
        myTree.put(new Student("Sviatoslav", "Dusko"));
        myTree.put(new Student("Oleg", "Dusko"));
        myTree.put(new Student("Petro", "Dusko"));
        myTree.put(new Student("Pavlo", "Dusko"));
        myTree.put(new Student("Ivan", "Dusko"));
        myTree.put(new Student("Slavik", "Dusko"));
        myTree.put(new Student("Vova", "Dusko"));
        myTree.put(new Student("Vitalik", "Dusko"));

        myTree.print();

        myTree.remove(new Student("Oleg", "Dusko"));

        myTree.print();
    }
}
