package com.day1;

/**
 * Created by lgm
 * on 2020/3/25.
 */
public class SwitchTest {

    public static void main(String[] args) {

        String name="冬";
        switch (name){
            case "春天":
                System.out.println("春天来了");
                break;

            case "夏天":
                System.out.println("夏天来了");
                break;
            case "秋天":
                System.out.println("秋天来了");
                break;
            case "冬天":
                System.out.println("冬天来了");
                break;
                default:
                    System.out.println("雨来了");
        }
    }
}
