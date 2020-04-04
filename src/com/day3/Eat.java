package com.day3;

import java.sql.SQLOutput;

/**
 * Created by lgm
 * on 2020/3/27.
 */
public abstract class Eat {


    public void statr(){
        eatBegin();
        eatNext();
        eatLast();
    }

    public void eatBegin(){
        System.out.println("开始吃饭");
    }

    public abstract void eatNext();
    public abstract void eatLast();


}
