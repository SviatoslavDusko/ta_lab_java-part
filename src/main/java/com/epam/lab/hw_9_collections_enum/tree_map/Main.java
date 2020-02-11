package com.epam.lab.hw_9_collections_enum.tree_map;

import com.epam.lab.hw_9_collections_enum.tree_map.test_classes.Person;
import com.epam.lab.hw_9_collections_enum.tree_map.test_classes.Student;

public class Main {
    public static void main(String[] args) {
        MyTree<Person> myTree = new MyTree<>();

        myTree.add(new Person("Oles", "Dusko"));
        myTree.add(new Student("Sviatoslav", "Dusko"));
        myTree.add(new Student("Oleg", "Dusko"));
        myTree.add(new Student("Petro", "Dusko"));
        myTree.add(new Student("Pavlo", "Dusko"));
        myTree.add(new Student("Ivan", "Dusko"));
        myTree.add(new Student("Slavik", "Dusko"));
        myTree.add(new Student("Vova", "Dusko"));
        myTree.add(new Student("Vitalik", "Dusko"));

        myTree.printTree();

        myTree.delete(new Student("Oleg", "Dusko"));

        myTree.printTree();
    }
}
