package com.day4;

import java.util.Objects;

/**
 * Created by lgm
 * on 2020/3/28.
 */
public class Person implements  Cloneable{
    int name;
    String age;
    Adress adress;

    public Person(int name, String age,Adress a) {
        this.name = name;
        this.age = age;
        this.adress =a;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public Adress getAdress() {
        return adress;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }



    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person clone =(Person) super.clone();
       // Adress ad= clone.getAdress();

        clone.setAdress((Adress) adress.clone());
        return clone;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", age='" + age + '\'' +
                ", adress=" + adress +
                '}';
    }
}
