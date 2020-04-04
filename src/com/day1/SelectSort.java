package com.day1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lgm
 * on 2020/3/25.
 */
public class SelectSort {
   // int[] arr={1,15,25,36,5,8,66};
    public static void main(String[] args) {
        new SelectSort().test();

      /*int [] arr = {2,15,25,36,5,8,66};

        int min = 0;

        for(int j =0;j<arr.length-1;j++) {
         min = arr[j];
            for (int i = j+1; i < arr.length; i++) {
                if (min > arr[i]) {
                    int temp = min;
                    min = arr[i];
                    arr[i] = temp;
                }
            }

            arr[j] = min;
            System.out.println("第"+(j+1)+"遍排序" + Arrays.toString(arr));
        }*/

    }

    public  void test(){
        Date date = new Date();
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd : hh:MM:ss");
        System.out.println(sm.format(date));

//        int [] arr = {3,15,25,36,5,8,66};
        int [] arr2 = new int[80000];
        for(int a =0;a<arr2.length;a++){
            arr2[a] = (int) (Math.random()*80000);

        }

        int min =0;
        for(int i =0;i<arr2.length-1;i++){
            min = i;
            for(int j =i+1;j<arr2.length;j++){
                     if(arr2[min] > arr2[j]){
                         min =j;

                     }
            }

            if(i!=min){
                int temp = arr2[i];
                arr2[i] = arr2[min];
                arr2[min] = temp;


            }
        }



        Date date2 = new Date();
        SimpleDateFormat sm2 = new SimpleDateFormat("yyyy-MM-dd : hh:MM:ss");
        System.out.println(sm.format(date2));
    }


}
