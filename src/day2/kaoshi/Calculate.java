package day2.kaoshi;

/**
 * @author tjk
 * @date 2019/8/2 16:58
 */
public class Calculate {
    //加法
    public int add(int a, int b) {
        return a + b;
    }

    //减法
    public int sub(int a, int b) {
        return a - b;
    }

    //乘法
    public int multiplication(int a, int b) {
        return a * b;
    }

    //除法
    public int division(int a, int b) {
        return a / b;
    }


    // 较大数 较小数

    public int maxNum(int a, int b) {
        if (a > b) {
            return a;
        }else {
            return b;
        }
    }

    /**
     * 对浮点数（double型）的计算功能。如：给定浮点数d，取大于或等于d的最小整数，
     * 取小于或等于d的最大整数，计算最接近d的整数值，计算d的平方根、自然对数log(d)等。
     * （5）计算以double型数a为底数，b为指数的幂。
     * @return
     */

    public double function() {
        return 0;

    }

}
