package com.day4;

import javafx.scene.effect.SepiaTone;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by lgm
 * on 2020/3/28.
 * 自然排序
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        //自然排序
        Set<user> s = new TreeSet<user>();
        s.add(new user(50,"aa"));
        s.add(new user(30,"bb"));
        s.add(new user(40,"rr"));
        System.out.println(s);
        //定制排序
        Set<user> s2 = new TreeSet<user>((o1, o2) -> o1.age > o2.age ? 1:-1);
        s2.add(new user(15,"kk"));
        s2.add(new user(12,"kk"));
        s2.add(new user(18,"ff"));
        System.out.println(s2);
    }
}


class user implements Comparable{

    int age;
    String name;

    public user(int age, String name) {
        this.age = age;
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        user user = (user) o;
        return age == user.age &&
                Objects.equals(name, user.name);
    }

    @Override
    public int compareTo(Object o) {
        user u = (user)o;
        return u.name.compareTo(this.name);
        //return u.age>this.age ? 1 : -1;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);


    }

    @Override
    public String toString() {
        return "user{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
