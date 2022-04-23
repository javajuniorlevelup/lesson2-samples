package ru.levelp.func;

import ru.levelp.func.model.Vector2D;

import java.util.LinkedList;
import java.util.List;

public class TransformChain {
    private final List<Transformer> transformers = new LinkedList<>();

    public void add(Transformer transformer) {
        transformers.add(transformer);
    }

    public Vector2D execute(Vector2D source) {
        Vector2D result = source;
        for(Transformer transformer : transformers) {
            result = transformer.transform(result);
        }
        return result;
    }
}
