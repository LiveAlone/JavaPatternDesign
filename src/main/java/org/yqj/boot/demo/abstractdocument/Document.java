package org.yqj.boot.demo.abstractdocument;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Created by yaoqijun on 2017/6/8.
 */
public interface Document {

    void put(String name, Object object);

    Object get(String name);

    <T> Stream<T> children(String key, Function<Map<String, Object>, T> construct);

}
