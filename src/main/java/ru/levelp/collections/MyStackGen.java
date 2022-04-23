package ru.levelp.collections;

import ru.levelp.collections.model.Box;
import ru.levelp.collections.model.Shape;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class MyStackGen<T> {
    private final List<T> objects = new LinkedList<>();

    public void push(T obj) {
        objects.add(0, obj);
    }

    public void pushAll(Collection<? extends T> source) {
        for(T item : source) {
            push(item);
        }
    }

    public T pop() {
        return objects.remove(0);
    }

    public boolean isEmpty() {
        return objects.isEmpty();
    }

}

// Collection<Shape>
// Collection<Circle>