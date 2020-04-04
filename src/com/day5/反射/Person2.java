package com.day5.反射;

/**
 * Created by lgm
 * on 2020/3/30.
 */
public class Person2 {
    public int age;
    private String name;

    public Person2() {
    }

    public Person2(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void say(int day){
        System.out.println("今天是"+day+"号");
    }

    private void call(String o){
        System.out.println("名字是"+o);
    }

    @Override
    public String toString() {
        return "Person2{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
