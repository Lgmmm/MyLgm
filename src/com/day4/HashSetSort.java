package com.day4;

import java.util.*;

/**
 * Created by lgm
 * on 2020/3/29.
 */
public class HashSetSort {

    public static void main(String[] args) {


        Set<String> set = new HashSet<>();
        set.add("20180101");
        set.add("20180104");
        set.add("20180103");
        set.add("20180102");
        set.add("20180105");
        System.out.println(set);
       Set<String> set2 = new HashSet<>();
        set2.addAll(set);
        System.out.println(set2);

      /*   Set<String> sortSet = new TreeSet<>((o1, o2) -> o2.compareTo(o1));
        sortSet.addAll(set);
        System.out.println(set.toString());*/
      /*  ArrayList<Emp> list = new ArrayList<>(set);
        list.sort((o1, o2) -> o2.getName().compareTo(o1.getName()));
        System.out.println(list);*/
    }
}


class Emp{
    int age;
    String name;

    public Emp(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}