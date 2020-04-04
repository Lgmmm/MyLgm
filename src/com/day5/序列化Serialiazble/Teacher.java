package com.day5.序列化Serialiazble;

import java.io.Serializable;

/**
 * Created by lgm
 * on 2020/3/30.
 */
public class Teacher implements Serializable {
    private String name;
    private Student stu;

    public Teacher(String name, Student stu) {
        this.name = name;
        this.stu = stu;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", stu=" + stu +
                '}';
    }
}
