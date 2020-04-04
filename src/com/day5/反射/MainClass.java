package com.day5.反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by lgm
 * on 2020/3/30.
 */
public class MainClass {
    public static void main(String[] args) throws Exception{
        Class p = Person.class;
        Person person = (Person) p.newInstance();
//        System.out.println(Arrays.toString(p.getFields()));
        Field f = p.getField("age");
        f.set(person,10);

        Field f2 = p.getDeclaredField("name");

        f2.setAccessible(true);
        f2.set(person,"kk");


        System.out.println(person);

        Constructor con = p.getConstructor(int.class, String.class);
        Person person1 = (Person)con.newInstance(10,"LL");

        Method m = p.getMethod("say");
        m.invoke(person1);

        Method m2 = p.getMethod("getAge");
        System.out.println(m2.invoke(person1));


    }
}
