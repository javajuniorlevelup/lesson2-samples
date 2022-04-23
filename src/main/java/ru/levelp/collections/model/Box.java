package ru.levelp.collections.model;

public class Box implements Shape {

    private final int sizeA;
    private final int sizeB;
    private final int sizeC;

    public Box(int sizeA, int sizeB, int sizeC) {
        this.sizeA = sizeA;
        this.sizeB = sizeB;
        this.sizeC = sizeC;
    }

    public int getSizeA() {
        return sizeA;
    }

    public int getSizeB() {
        return sizeB;
    }

    public int getSizeC() {
        return sizeC;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Draw box A=%d, B=%d, C=%d", sizeA, sizeB, sizeC));
    }
}
