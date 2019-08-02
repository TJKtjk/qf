package day2.kaoshi;

/**
 * @author tjk
 * @date 2019/8/2 17:16
 */
public class SquareTest {
    public static void main(String[] args) {
        Shape shape=new Square(3.0);
        shape.area();
        System.out.println("shape.area() = " + shape.area());
    }
}
