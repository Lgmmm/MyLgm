package com.day1;

/**
 * Created by lgm
 * on 2020/3/25.
 */
public class neiBuLei {

     int a=5;
    private int b =6;

    public static void main(String[] args) {

        new neiBuLei().say();

    }



    public void say(){
       /* User user = new User();
        user.test();
*/

        User2 user1 = new User2();
        user1.get();
        User2.set();
        System.out.println("普通方法");
    }
    private  void say2(){
        System.out.println("静态方法");

    }

    class User{
        int c =10;
        int height;
//非静态内部类可以直接访问外部类的变量和方法
        public void test(){
            System.out.println(a);
            System.out.println(b);

            say2();
            System.out.println("内部类普通方法" );
        }

        //非静态内部类不能有静态方法和静态变量,静态代码块
      /*  public static void test2(){
            System.out.println("内部类的静态方法");
        }*/
    }

    static class User2{
        int a =5;
        int b ;

        public void get(){
            System.out.println("aa");
            new neiBuLei().say2();

        }
        public static void set(){
            System.out.println("bb");
        }
    }
}


