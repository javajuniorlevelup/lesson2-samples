package ru.levelp.collections;

import ru.levelp.collections.model.Box;
import ru.levelp.collections.model.Circle;
import ru.levelp.collections.model.Shape;

import java.util.List;

class Oval extends Circle {

    public Oval(int radius) {
        super(radius);
    }
}

public class Main {
    public static void main(String[] args) {
        example4();
    }

    public static void example1() {
        MyStack stack = new MyStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        while (!stack.isEmpty()) {
            Object obj = stack.pop();
            System.out.println(obj);
        }
    }

    public static void example2() {
        MyStack stack = new MyStack();

        stack.push(new Circle(1));
        stack.push(new Circle(2));
        stack.push(new Circle(3));
        stack.push(new Box(1, 2, 3));

        while (!stack.isEmpty()) {
            Circle circle = (Circle) stack.pop();
            System.out.println(String.format("Circle R=", circle.getRadius()));
        }
    }

    public static void example3() {
        MyStackGen<Shape> stack = new MyStackGen<>();

        stack.push(new Circle(1));
        stack.push(new Circle(2));
        stack.push(new Circle(3));
//        stack.push(new Box(1, 2, 3));

        while (!stack.isEmpty()) {
            Shape circle = stack.pop();
            circle.draw();
        }
    }

    public static void example4() {
        MyStackGen<Shape> stack = new MyStackGen<>();

        List<Shape> circles = List.of(new Circle(1), new Circle(2), new Circle(3), new Box(6, 2, 1));
        stack.pushAll(circles);

        while (!stack.isEmpty()) {
            Shape circle = stack.pop();
            circle.draw();
        }
    }
}
