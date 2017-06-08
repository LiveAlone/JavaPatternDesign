package org.yqj.boot.demo.abstractdocument.domain;

import org.yqj.boot.demo.abstractdocument.AbstractDocument;

import java.util.Map;

/**
 * Created by yaoqijun on 2017/6/8.
 */
public class Car extends AbstractDocument implements HasModel, HasPrice, HasParts{
    public Car(Map<String, Object> properties) {
        super(properties);
    }
}
