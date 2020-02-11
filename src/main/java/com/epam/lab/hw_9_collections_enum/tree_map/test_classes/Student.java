package com.epam.lab.hw_9_collections_enum.tree_map.test_classes;

public class Student extends Person {

    public Student(String name, String secondName) {
        super(name, secondName);
    }

    public String getCompareValue() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
