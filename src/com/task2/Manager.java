package com.task2;

/**
 * @author tjk
 * @date 2019/7/31 19:42
 */
public class Manager extends Employee {

    private int money;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString(){
        return "名字：\"+programper.getName()+\" 工号\"+programper.getId()+\" 薪水\"+programper.getSalary()";

    }

}
