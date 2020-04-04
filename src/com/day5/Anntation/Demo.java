package com.day5.Anntation;

import java.lang.reflect.Method;

/**
 * Created by lgm
 * on 2020/3/30.
 */
@MyAnntation(name = "com.day5.Anntation.RealClass",menthod = "show")
public class Demo {
    public static void main(String[] args) {
        Class<Demo> c = Demo.class;
        MyAnntation annotation = c.getAnnotation(MyAnntation.class);
        String name = annotation.name();
        String menthod = annotation.menthod();
        System.out.println(name);
        System.out.println(menthod);

        try {
            Class<?> aClass = Class.forName(name);
            RealClass o = (RealClass)aClass.newInstance();
            Method method2 = aClass.getMethod(menthod);
            method2.invoke(o);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
