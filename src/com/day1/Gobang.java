package com.day1;

import java.util.Arrays;

/**
 * Created by lgm
 * on 2020/3/25.
 */
public class Gobang {
    public static void main(String[] args) {

        String [] []  a=new String[15][15];
    //二维数组遍历
      for(int i=0 ; i<a.length ; i++){
            for(int j =0;j<a[i].length;j++){

                a[i][j] = "十";
                System.out.print(a[i][j]);
            }
          System.out.print("\n");
        }

      a[11][10] = "o";

    }
}
