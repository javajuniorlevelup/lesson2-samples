package ru.levelp.func;

import ru.levelp.func.model.Vector2D;

import java.security.SecureRandom;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static ru.levelp.func.Ops.*;

public class Main {
    public static void main(String[] args) {
        example2();
    }

    static void example1() {
        Vector2D vector = new Vector2D(1, 0);

//        Transformer rotate90 = source -> rotate(source, 90);
//        Transformer scaleDouble = source -> scale(source, 2);

        TransformChain chain = new TransformChain();
        chain.add(source -> rotate(source, 90));
        chain.add(source -> scale(source, 2));

        System.out.println("Original vector: " + vector);
        System.out.println("New vector: " + chain.execute(vector));
    }

    static void example2() {
        Random random = new SecureRandom();

        Supplier<Integer> randomGenerator = () -> random.nextInt(100);

        List<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            randomList.add(randomGenerator.get());
        }

        print("Original list", randomList);

        List<Integer> list1 = randomList.stream()
                .filter(num -> num > 50)
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        print("Filtered list", list1);
        print("Modified ", randomList.stream().map(num -> num * 2).collect(Collectors.toList()));

        List<Integer> randomList2 = IntStream.range(0, 10).map($ -> randomGenerator.get()).boxed().collect(Collectors.toList());

        randomList.stream()
                .filter(Main::greaterThan50)
                .filter(num -> num % 2 == 0)
                .map(num -> num * 2)
                .forEach(num -> {
                    System.out.println(num);
                });

        int sum = randomList.stream().reduce((acc, value) -> acc + value).get();
        System.out.println("Sum: " + sum);

    }

    static boolean greaterThan50(Integer num) {
        return num > 50;
    }

    static void print(String label, List<Integer> source) {
        List<String> strings = source.stream().map(Object::toString).collect(Collectors.toList());
        System.out.println(label + ": " + String.join(", ", strings));
    }
}
