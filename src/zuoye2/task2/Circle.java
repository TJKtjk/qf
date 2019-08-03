package zuoye2.task2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
/**
 * @author tjk
 * @date 2019/8/3 10:55
 */
public class Circle {
    public double circle(double r) {
        double area = Math.PI * r * r;

        // 新方法，如果不需要四舍五入，可以使用RoundingMode.DOWN
        BigDecimal bg = new BigDecimal(area).setScale(5, RoundingMode.UP);
        return bg.doubleValue();
    }

    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println("circle.circle(2) = " + circle.circle(2));
    }

}
