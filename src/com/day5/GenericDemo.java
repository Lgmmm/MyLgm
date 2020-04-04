package com.day5;

import java.util.List;

/**
 * Created by lgm
 * on 2020/3/29.
 * 泛型
 */
public class GenericDemo {
    public static void main(String[] args) {
        Person<Integer,String> p = new Person<Integer,String>(10,"25");

        System.out.println(p);
    }


    public <T>T say(T t){

        return t;
    }

    public void get(List<? extends Number> list){

    }
    public void get2(List<? super String> list){

    }
}


class Person<T1,T2>{
    T1 age;
    T2 name;

    public Person(T1 age, T2 name) {
        this.age = age;
        this.name = name;
    }

    public T1 getAge() {
        return age;
    }

    public T2 getName() {
        return name;
    }

    public void setAge(T1 age) {
        this.age = age;
    }

    public void setName(T2 name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name=" + name +
                '}';
    }
}