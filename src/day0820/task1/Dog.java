package day0820.task1;

import java.io.Serializable;

/**
 * @author tjk
 * @date 2019/8/20 10:40
 */
public class Dog {
    private String name;
    private int age;
    private String clolor;

    private String password;

    public String address;
    public int weight;
    public String height;

    public Dog() {
    }


    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClolor() {
        return clolor;
    }

    public void setClolor(String clolor) {
        this.clolor = clolor;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}

class JinDog extends Dog implements Serializable {

    private int money;
    private int age;
    private int weight;

    private String password;

    // 无参构造器

    public JinDog() {
    }

    //有参构造器

    public JinDog(int age) {
        this.age = age;
    }


    public void drawMoney(int tmpMoney) throws RuntimeException {
        System.out.println("金旺财取钱:" + tmpMoney);
    }


    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}