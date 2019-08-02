package com.task3;

/**
 * @author tjk
 * @date 2019/7/31 19:47
 */
public class ProgramperTest {
    private String name;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void buyComputer() {
        System.out.println("程序员买电脑");
    }

    public void useComputer(Computer computer) {
        computer.runProgram();
        computer.playMovie();
        computer.playGame();
    }




    public static void main(String[] args) {

        ProgramperTest programperTest = new ProgramperTest();
        programperTest.setName("码农");
        programperTest.buyComputer();

        Computer computer=new Computer();
        computer.setBrand("华硕");





//        System.out.println("程序员：" + programperTest.getName() + " 去电脑专卖店买 "+computer.getBrand()+"品牌的电脑，");
//        System.out.println("使用一段时间，原装电脑显卡不给力");
//        System.out.println("去电脑专卖店买"+geforce.getGraphicsCardType()+"类型的独立显卡");
//        System.out.println("听说ati类型的显卡给力");
//        System.out.println("就去购买了"+ati.getGraphicsCardType()+"品牌的的显卡，并请店家装上，使用一段时间，");
//        programperTest.useComputer();
    }
}
