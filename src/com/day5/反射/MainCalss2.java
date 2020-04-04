package com.day5.反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by lgm
 * on 2020/3/30.
 */
public class MainCalss2 {
    public static void main(String[] args) throws Exception{

        Class<?> c = Class.forName("com.day5.反射.Person2");
        Class<Person2> c1 = Person2.class;
        Person2 person = c1.newInstance();
        //获取公开的字段
        Field f = c1.getField("age");
        f.set(person,10);
        //获取私有字段
        Field f1 = c1.getDeclaredField("name");
        //去除私有字段权限
        f1.setAccessible(true);
        f1.set(person,"kk");
        System.out.println(person);

        //获取公开的方法
        Method m = c1.getMethod("say", int.class);
        m.invoke(person,20);
        //获取私有方法
        Method m2 = c1.getDeclaredMethod("call", String.class);
        m2.setAccessible(true);
        m2.invoke(person,"hello");

        //通过构造器获取对象
        Constructor<?> con = c.getConstructor(int.class, String.class);
        Person2 aa =(Person2) con.newInstance(10, "aa");

        Method m3 = c.getMethod("say", int.class);
        m3.invoke(aa,10);

        Method m4 = c.getDeclaredMethod("call", String.class);
        m4.setAccessible(true);
        m4.invoke(aa,"mm");

    }
}
