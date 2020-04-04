package com.day1;

import com.day1.A;

/**
 * Created by lgm
 * on 2020/3/25.
 */
public class B {
    public static void main(String[] args) {

        int i = 0;
        for(int j = 0;j < 5; j++){
            i++;
            System.out.println("i =" + i);
        }

       /* int i =1;
         i = i++;
        System.out.println(i);
         int j = i++;
        System.out.println(i+"-----"+j);
*/

        System.out.println(A.a);
    }
}
