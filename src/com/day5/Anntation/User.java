package com.day5.Anntation;

/**
 * Created by lgm
 * on 2020/3/30.
 */
public @interface User {
    int age();
    String name() default "kk";
}
