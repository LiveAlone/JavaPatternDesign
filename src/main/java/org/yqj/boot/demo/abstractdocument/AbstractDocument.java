package org.yqj.boot.demo.abstractdocument;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Created by yaoqijun on 2017/6/8.
 */
public abstract class AbstractDocument implements Document {

    private final Map<String, Object> properties;

    public AbstractDocument(Map<String, Object> properties){
        Objects.requireNonNull(properties, "properties not empty");
        this.properties = properties;
    }

    @Override
    public void put(String name, Object object) {
        this.properties.put(name, object);
    }

    @Override
    public Object get(String name) {
        return properties.get(name);
    }

    @Override
    public <T> Stream<T> children(String key, Function<Map<String, Object>, T> construct) {
        Optional<List<Map<String, Object>>> any = Stream.of(get(key)).filter(el -> el != null)
                .map(el -> (List<Map<String, Object>>) el).findAny();
        return any.isPresent() ? any.get().stream().map(construct) : Stream.empty();
    }

    @Override
    public String toString() {
        return "AbstractDocument{" +
                "properties=" + properties +
                '}';
    }
}
