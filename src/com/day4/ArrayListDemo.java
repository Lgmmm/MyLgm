package com.day4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by lgm
 * on 2020/3/28.
 */
public class ArrayListDemo {

    public static void main(String[] args) {


        List<Object> list = new ArrayList();
        list.add(new Student(15,"aa"));
        list.add(new Student(18,"bb"));
        list.add(new Student(15,"zz"));
        list.add(new Student(25,"cc"));

        list.sort((o1, o2) -> ((Student)o1).getAge() > ((Student)o2).getAge() ? 1 :-1);
        System.out.println(list);

        list.replaceAll(o -> ((Student)o).getAge() );
        System.out.println(list);
    }
}
