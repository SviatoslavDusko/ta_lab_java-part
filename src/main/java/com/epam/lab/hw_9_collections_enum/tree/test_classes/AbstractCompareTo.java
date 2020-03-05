package com.epam.lab.hw_9_collections_enum.tree.test_classes;

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
