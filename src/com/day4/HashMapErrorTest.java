package com.day4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/**
 * Created by lgm
 * on 2020/3/28.
 */
public class HashMapErrorTest {
    public static void main(String[] args) {
        HashMap<A, String> ht = new HashMap<>();


        ht.put(new A(6000),"疯狂java讲义");
        ht.put(new A(87653),"轻量化javaee企业应用");
        ht.forEach((a, s) -> System.out.println(a+"="+s));
        System.out.println(ht.entrySet());

        Iterator<A> it = ht.keySet().iterator();
        A a = it.next();
        a.count=87653;

        System.out.println(ht);

        ht.remove(new A(87653));
        System.out.println(ht);

        System.out.println(ht.get(new A(86753)));

    }
}

class A{
    int count;

    public A(int count){
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return count == a.count;
    }

    @Override
    public int hashCode() {
        return this.count;
    }


}