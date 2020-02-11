package com.epam.lab.hw_9_collections_enum.tree_map.test_classes;

import com.sun.org.apache.xpath.internal.operations.String;

public abstract class AbstractCompareTo<T extends AbstractCompareTo> implements CompareToValue, Comparable<AbstractCompareTo> {
    private T type;

    @Override
    public T getCompareValue() {
        return type;
    }

    public int compareTo(T t) {
        return this.getCompareValue().compareTo(type.getCompareValue());
    }
}
