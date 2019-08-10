package day8kaoshi;
import java.util.Arrays;
import java.util.Scanner;
/**
 * @author tjk
 * @date 2019/8/9 16:59
 */
public class ExceptionTest {
    /**
     * 从命令行得到5个整数，放入一整型数组，然后打印输出，
     * 要求：如果输入数据丌为整数，要捕获Integer.parseInt()产生的异常，
     * 显示“请输入整数”，捕获输入参数不足5个的异常(数组越界)，显示“请输入至少5个整数”。
     */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("请输入5个整数：");

        int count = 0;
        int num = 0;
        try {
            for (int i = 0; i < 5; i++) {
                String b = sc.next();
                count++;
                num = Integer.parseInt(b);
                arr[i] = num;
            }
            if (count < 5) {
                throw new ParameterException();
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (ParameterException e) {
            System.out.println("请输入至少5个整数");
            e.printStackTrace();

        }


        System.out.println(Arrays.toString(arr));

    }


}
