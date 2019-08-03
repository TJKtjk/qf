package zuoye2.task2;

import java.math.BigDecimal;
/**
 * @author tjk
 * @date 2019/8/3 10:55
 */
public class Circle {
    public void circle(double r) {

        double area = Math.PI * r * r;

        BigDecimal bg=BigDecimal.valueOf(area).setScale(5, BigDecimal.ROUND_HALF_DOWN);
        System.out.println("bg = " + bg);

    }

    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.circle(2.0);
    }

}
