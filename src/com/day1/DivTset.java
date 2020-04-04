package com.day1;

/**
 * Created by lgm
 * on 2020/3/25.
 */
public class DivTset{
    public static void main(String[] args) {
     /*   System.out.println(5%3);
        System.out.println(6%2);
        System.out.println(7%4);
        System.out.println(5%0.0);
        System.out.println(-5%0.0);*/

        int a = 6<<1;//   6*2
        System.out.println(a);
        int a2 = 6<<2;//6*2*2
        System.out.println(a2);
        int a3 = 6<<3;//6*2*2*2
        System.out.println(a3);


        int b = 6>>1;//6/2
        System.out.println(b);
        int b2 = 6>>2;//6/2/2
        System.out.println(b2);
        int b3 = 6>>3;//6/2/2/2
        System.out.println(b3);

        //三目运算符
        //判断条件  ？  参数1（为真的话返回参数1）  :  参数2（为假的话返回参数2）
        //类似if else判断语句

      /*  if(5<9){
            return "zhen";
        }else{
            return "jia ";
        }*/
        System.out.println(5<9 ? "zhen" : "jia ");
    }

}
