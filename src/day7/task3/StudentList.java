package day7.task3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tjk
 * @date 2019/8/7 19:05
 */
public class StudentList {


    public static void main(String[] args) {

        List<Object> list = new ArrayList< >(10);

        Student s1 = new Student("zhangsan", "bg1901", 60);
        Student s2 = new Student("xiaojun", "bg101", 70);
        Student s3 = new Student("wangwu", "H51902", 80);
        Student s4 = new Student("lihong", "H511", 90);
        Student s5 = new Student("dapeng", "java1907", 100);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        // 遍历
        for (Object o : list
        ) {
            System.out.println(o.toString());
        }

        // 打印学生信息
        System.out.println("s1 = " + s1);

        // 比较2个人
        Student s6=new Student("zhangsan", "H51801", 90);
         if (s6.equals(s1)){
             System.out.println("是同一个人");
         }else{
             System.out.println("不是同一个人");

         }


    }

}
