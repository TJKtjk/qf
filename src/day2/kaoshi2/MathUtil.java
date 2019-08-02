package day2.kaoshi2;

/**
 * @author tjk
 * @date 2019/8/2 17:48
 */
public class MathUtil {
    // 定义一个静态的，有一个参数，有返回值的方法，实现求一个数的绝对值。
    public  static int abs(int a){
        return Math.abs(a);

    }

    // 定义一个静态的，有一个参数，有返回值的方法，实现求一个数的平方。
    public  static int  square(int a){
        return  a*a;
    }


    //定义一个静态的，有两个参数，有返回值的方法，实现求两个数中的较大者
    public  static int  max(int a,int b){
        if(a>b){
            return a;
        }
        else {
            return b;
        }

    }

    //定义一个静态的，有一个参数，有返回值的方法，实现对一个数进行四舍五入
    public static double acceptOrReject(double a){
        return  Math.round(a);
    }


}
