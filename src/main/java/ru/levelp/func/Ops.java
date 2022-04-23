package ru.levelp.func;

import ru.levelp.func.model.Vector2D;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public final class Ops {
    private Ops() {}

    public static Vector2D scale(Vector2D source, float scalar) {
        return new Vector2D(source.x * scalar, source.y * scalar);
    }

    public static Vector2D rotate(Vector2D source, float angle) {
        float rad = (float) (angle * Math.PI / 180);
        float x = source.x;
        float y = source.y;

        return new Vector2D(
                (float) (x * cos(rad) - y * sin(rad)),
                (float) (x * sin(rad) + y * cos(rad))
        );
    }
}
