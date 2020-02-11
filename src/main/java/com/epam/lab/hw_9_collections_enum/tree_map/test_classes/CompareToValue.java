package com.epam.lab.hw_9_collections_enum.tree_map.test_classes;

public interface CompareToValue<T> {
    T getCompareValue();

    int compareTo();
}
