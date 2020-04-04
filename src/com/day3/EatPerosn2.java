package com.day3;

/**
 * Created by lgm
 * on 2020/3/27.
 */
public class EatPerosn2 extends Eat {
    @Override
    public void eatNext() {
        System.out.println("先吃菜");

    }

    @Override
    public void eatLast() {
        System.out.println("最后喝汤");
    }
}
