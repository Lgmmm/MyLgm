package com.day1;

import java.util.Objects;

/**
 * Created by lgm
 * on 2020/3/25.
 */
public class Test {
    public static void main(String[] args) {


        System.out.println(Integer.valueOf("123"));
        System.out.println();
        /*int b=5;
        int bb =5;
      //  System.out.println(b==bb);



        String a ="aa";
        String aa = "aa";
        System.out.println(a==aa);
        System.out.println(a.equals(aa));

        String s = new String("aa");
        String ss = new String ("aa");


        System.out.println(s==ss);
        System.out.println(s.equals(ss));

        System.out.println(a.equals(s));
        System.out.println(a==s);*/


    //==比较两个变量或者引用的内存地址是否一样
        //equals 比较的是两个变量或者实例同一个内存地址的内容是否一样
      //  1、==基础数据类型：比较的是他们的值是否相等，比如两个int类型的变量，比较的是变量的值是否一样。

       // 2、==引用数据类型：比较的是引用的地址是否相同，比如说新建了两个User对象，比较的是两个User的地址是否一样。
        User aa = new User(15, "aa");
        User aa1 = new User(15, "aa");
        System.out.println(aa==aa1);
        System.out.println(aa.equals(aa1));

        System.out.println("-----------");
        Integer aaa=new Integer(5);
        Integer bbb=new Integer(5);

        int a=10;
        int b=10;
        String str1=new String("justice");
        String str2=new String("justice");
        String str3;
        str3=str1;

        System.out.println(aaa==bbb);
        System.out.println(aaa.equals(bbb));
        System.out.println(a==b);

        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));

        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));

    }
}



class User{
    int age;
    String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}