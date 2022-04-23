package ru.levelp.collections;

import java.util.LinkedList;
import java.util.List;

public class MyStack {
    private final List objects = new LinkedList<>();

    public void push(Object obj) {
        objects.add(0, obj);
    }

    public Object pop() {
        return objects.remove(0);
    }

    public boolean isEmpty() {
        return objects.isEmpty();
    }
}
