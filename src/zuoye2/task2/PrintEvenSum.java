package zuoye2.task2;

import java.util.Random;

/**
 * @author tjk
 * @date 2019/8/3 10:11
 */
public class PrintEvenSum {

    // 打印 2~32 之间产生的6个随机偶数的和
    public static void main(String[] args) {

        int[] arr = new int[10000];
        int sum = 0;
        int n = 0;

        for (int i = 1; i < 10000; i++) {

            Random rand = new Random();

            //int ranNumber =ran.nextInt(max - min + 1) + min;
            arr[i] = rand.nextInt((32 - 2 + 1)) + 2;

            if (arr[i] % 2 == 0) {
                sum += arr[i];
                n++;
                System.out.println("arr[" + i + "] = " + arr[i]);
            }
            if (n == 6) {
                break;
            }

        }
        System.out.println("sum = " + sum);
    }


    // 圆面积


}
