package ru.levelp.func.model;

public class Vector2D {
    public final float x, y;

    public Vector2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Vector2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
