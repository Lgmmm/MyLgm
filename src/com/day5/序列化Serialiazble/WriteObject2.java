package com.day5.序列化Serialiazble;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by lgm
 * on 2020/3/30.
 * 引用类型序列化
 */
public class WriteObject2 {
    public static void main(String[] args) throws Exception{
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("object2.txt"));

        Student stu = new Student(12,"zs");
        Teacher tea = new Teacher("语文老师",stu);
        Teacher tea2 = new Teacher("数学老师",stu);



       ArrayList<Object> list = new ArrayList<>();
         list.add(stu);
         list.add(tea);
         list.add(tea2);

         out.writeObject(list);

    }
}
