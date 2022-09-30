package com.cg.boot.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "mycar")
public class Car {
    private String animal;
    private String name;

    @Override
    public String toString() {
        return "Car{" +
                "animal='" + animal + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car() {
    }

    public Car(String animal, String name) {
        this.animal = animal;
        this.name = name;
    }
}
