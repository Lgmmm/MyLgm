package com.day5.反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.SQLOutput;

/**
 * Created by lgm
 * on 2020/4/3.
 */
public class Demo {
    public static void main(String[] args) throws Exception{
        Class<User> c = User.class;
        User user = c.newInstance();
        Field age = c.getField("a");
        age.set(user,10);

        System.out.println(c.getPackage());
        Field name = c.getDeclaredField("name");
        name.setAccessible(true);
        name.set(user,"zs");

        Method say = c.getMethod("say", String.class);
        say.invoke(user,"zs");

        Method show = c.getDeclaredMethod("show",String.class);
        show.setAccessible(true);
        show.invoke(user,"zz");

        System.out.println(user);


        System.out.println("------------------------------");

        Class<User> c1 = User.class;
        Constructor<User> con = c1.getConstructor(int.class, String.class);
        User user1 = con.newInstance(10,"dsjkahd");




    }
}

class User{
    public int a;
    private String name;

    public User() {
    }

    public User(int a, String name) {
        this.a = a;
        this.name = name;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void say(String str){
        System.out.println(str);

    }

    private void show(String str){
        System.out.println(str);
    }

    @Override
    public String toString() {
        return "User{" +
                "a=" + a +
                ", name='" + name + '\'' +
                '}';
    }
}
