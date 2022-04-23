package ru.levelp.func;

import ru.levelp.func.model.Vector2D;

@FunctionalInterface
public interface Transformer {
    Vector2D transform(Vector2D source);
}
