package org.yqj.boot.demo.abstractdocument.domain;

import org.yqj.boot.demo.abstractdocument.Document;

import java.util.Optional;

/**
 * Created by yaoqijun on 2017/6/8.
 */
public interface HasModel extends Document{

    String properties = "model";

    default Optional<String> getModel(){
        return Optional.ofNullable((String) get(properties));
    }

}
