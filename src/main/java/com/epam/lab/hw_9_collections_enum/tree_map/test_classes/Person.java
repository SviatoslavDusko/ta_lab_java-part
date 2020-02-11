package com.epam.lab.hw_9_collections_enum.tree_map.test_classes;

public class Person implements Comparable<Person> {
    String name;
    String secondName;

    public Person(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    public String getCompareValue() {
        return name;
    }

    @Override
    public int compareTo(Person p) {
        return this.getCompareValue().compareTo(p.getCompareValue());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
