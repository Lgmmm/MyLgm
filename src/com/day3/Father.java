package com.day3;

/**
 * Created by lgm
 * on 2020/3/27.
 */
public class Father {

    int a = 10;
    static int k=20;
    public void say(){

            hh hh = new hh();
            hh.haha();

        }
        public void say2(){
            System.out.println("say2");

    }

    class hh{
        int a=15;
        public void haha(){
            System.out.println(k);
            say2();
        }
        public void say2(){
            System.out.println("say213");

        }
    }

    public static void main(String[] args) {
        new Father().say();
    }
}
