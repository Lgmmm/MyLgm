package com.day5.序列化Serialiazble;

import java.io.Serializable;

/**
 * Created by lgm
 * on 2020/3/30.
 */
public class Student implements Serializable {
    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
