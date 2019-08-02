package day2.kaoshi;

/**
 * @author tjk
 * @date 2019/8/2 17:12
 */

public class Square implements Shape {

    private double a;
    public Square(double a){
        this.a=a;
    }

    @Override
    public double area() {
        return a*a;
    }
}
