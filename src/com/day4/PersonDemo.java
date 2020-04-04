package com.day4;

/**
 * Created by lgm
 * on 2020/3/28.
 */
public class PersonDemo {
    public static void main(String[] args) {
        try {
            Adress ad = new Adress("广州","gz");
            Person p = new Person(1,"hello",ad);

            Person p2 = (Person) p.clone();
            System.out.println(p==p2);
            p2.age = "world";
            p2.name =20;
            System.out.println(p);
            System.out.println(p2);
            /*System.out.println(p==p2);
            System.out.println(p2.adress==p.adress);
            System.out.println(p2.age==p.age);
            System.out.println(p2.name==p.name);*/
            System.out.println(p2.adress+"------"+p.adress);
            p2.getAdress().setName("深圳");
            System.out.println(p2.adress+"------"+p.adress);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
