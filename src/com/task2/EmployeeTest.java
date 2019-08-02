package com.task2;

/**
 * @author tjk
 * @date 2019/7/31 19:51
 */
public class EmployeeTest {
    public static void main(String[] args) {

        Programper programper=new Programper();
        programper.setName("程序员");
        programper.setId("20200018");
        programper.setSalary(10000);


        System.out.println("名字："+programper.getName()+" 工号"+programper.getId()+" 薪水"+programper.getSalary());



    }
}
