package org.yqj.boot.demo.abstractdocument;

import org.yqj.boot.demo.abstractdocument.domain.Car;
import org.yqj.boot.demo.abstractdocument.domain.HasModel;
import org.yqj.boot.demo.abstractdocument.domain.HasParts;
import org.yqj.boot.demo.abstractdocument.domain.HasPrice;
import org.yqj.boot.demo.abstractdocument.domain.HasType;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yaoqijun on 2017/6/8.
 */
public class App {
    public static void main(String[] args) {
        Map<String, Object> carProperties = new HashMap<>();
        carProperties.put(HasModel.properties, "3000SL");
        carProperties.put(HasPrice.PROPERTY, 10000L);


        Map<String, Object> wheelProperties = new HashMap<>();
        wheelProperties.put(HasType.type, "wheel");
        wheelProperties.put(HasModel.properties, "15C");
        wheelProperties.put(HasPrice.PROPERTY, 100L);

        Map<String, Object> doorProperties = new HashMap<>();
        doorProperties.put(HasType.type, "door");
        doorProperties.put(HasModel.properties, "Lambo");
        doorProperties.put(HasPrice.PROPERTY, 300L);

        carProperties.put(HasParts.properties, Arrays.asList(wheelProperties, doorProperties));

        Car car = new Car(carProperties);

        System.out.println("Here is our car:");
        System.out.println("-> model: {}" + car.getModel().get());
        System.out.println("-> price: {}" + car.getPrice().get());
        System.out.println("-> parts: ");
        car.getParts().forEach(p -> System.out.println(p.getType().get() + p.getModel().get() + p.getPrice().get()));
    }
}
