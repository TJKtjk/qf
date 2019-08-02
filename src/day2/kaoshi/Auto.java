package day2.kaoshi;

/**
 * @author tjk
 * @date 2019/8/2 16:46
 */

public abstract class Auto {
    private int shoeNum;
    private String color;
    private int weight;
    private int speed;

    //无参
    public Auto() {

    }

    //有参
    public Auto(int shoeNum, String color, int weight, int speed) {
        this.color = color;
        this.shoeNum = shoeNum;
        this.speed = speed;
        this.weight = weight;

    }

    public abstract void speedUp();

    public abstract void slowDown();

    public abstract void stop();

    public int getShoeNum() {
        return shoeNum;
    }

    public void setShoeNum(int shoeNum) {
        this.shoeNum = shoeNum;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


}
