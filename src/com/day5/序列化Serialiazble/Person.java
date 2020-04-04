package com.day5.序列化Serialiazble;

import java.io.Serializable;

/**
 * Created by lgm
 * on 2020/3/30.
 */
public class Person implements Serializable {
    private static final long serialVersionUID = -8698867997495520564L;


    // private static final long serialVersionUID

    private int age;
    private String name;

    public Person(int age, String name) {

        System.out.println("有参数的构造器");
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
