package com.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by lgm
 * on 2020/3/28.
 */
public class ArrayListSort {
    public static void main(String[] args) {
        List<Person2> list = new ArrayList();
        list.add(new Person2(10,"kk1"));
        list.add(new Person2(8,"kk2"));
        list.add(new Person2(29,"kk6"));
        list.add(new Person2(4,"kk8"));
      //  list.sort((o1, o2) ->o1.age>o2.age ? 1 :-1 );
        Collections.sort(list,(o1, o2) -> o1.age>o2.age ? 1 :-1);
        System.out.println(list);
    }
}


class Person2 {


    int age;
    String name;

    public Person2(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }


}

