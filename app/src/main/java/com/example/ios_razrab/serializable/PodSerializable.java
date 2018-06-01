package com.example.ios_razrab.serializable;

import java.io.Serializable;

public class PodSerializable implements Serializable {

    int age;
    String name;
    // Поля помеченные transient не сериализуются
    transient String experimentalTransient;

    public PodSerializable(int age, String name, String experimentalTransient) {
        this.age = age;
        this.name = name;
        this.experimentalTransient = experimentalTransient;
    }
}
