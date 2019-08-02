package com.task3;

/**
 * @author tjk
 * @date 2019/7/31 20:52
 */
public class Computer {

     private String brand;
     private int salePrice;
     /**
     * 显卡
     */
    private GraphicsCard graphicsCard;

    public Computer(){

    }

    public Computer(GraphicsCard graphicsCard){
        this.graphicsCard=graphicsCard;

    }


    public void runProgram() {
        System.out.println("runProgram");
    }

    public void playGame() {

        System.out.println("runGame");
    }

    public void playMovie() {
        System.out.println("playMovie");
    }



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }
}
