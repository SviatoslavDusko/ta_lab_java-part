package com.epam.lab.hw_7_8_collection.generics.priority_queue;

import java.util.*;

public class MyPriorityQueue<T> {
    private List<T> list = new ArrayList<>();

    private List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public int size() {
        return getList().size();
    }

    public boolean offer(T t) {
        try {
            getList().add(t);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public T poll() {
        if (getList().size() > 0) {
            T item;
            item = getList().get(0);
            for (int i = 0; i < getList().size() - 1; i++) {
                getList().set(i, getList().get(i + 1));
                if (i == getList().size() - 2) {
                    getList().remove(getList().size() - 1);
                }
            }
            return item;
        }
        return null;
    }

    public T peek() {
        if (getList().size() != 0) {
            return getList().get(0);
        } else {
            return null;
        }
    }

    public void clear() {
        this.list = new ArrayList<>();
    }

    public boolean contains(Object o) {
        return getList().contains(o);
    }

    @Override
    public String toString() {
        return "MyPriorityQueue{" +
                "list=" + list +
                '}';
    }
}
