package exceptiontask.task1;

import java.util.Scanner;

/**
 * @author tjk
 * @date 2019/8/5 18:29
 */
public class Division {
    /**
     * 编写一个除法计算器，从命令行的两个参数，要求只能传入正数，计算两数相除。并且输出结果
     * 1. 判断如果类型不一致,抛出NumberFormatException异常, 2. 整除时为零抛出ArithmeticException异常
     * 3. 如果输入数字为负数,抛出自定义的异常(运行时异常)
     */


    public void division() {
        boolean flag = true;
        Scanner sc=new Scanner(System.in);

        while (flag) {


            try {

                System.out.println("请输入 两个正数 ：");
                //输入的数字或字母等都先当成String类型储存

                String number1 = sc.nextLine();
                String number2 = sc.nextLine();

                //不可以可以转化成整数就会产生想要的异常
                int n1 = Integer.parseInt(number1);
                int n2 = Integer.parseInt(number2);

                if(n1 < 0 || n2 < 0){
                    throw new NegativeNumberException();
                }

                int result=n1/n2;

                System.out.println("division of result:"+result );

                flag = false;
            }
            catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("NumberFormatException! Please try to input again!  ");
            }
            catch (ArithmeticException e){
                e.printStackTrace();
                System.out.println("ArithmeticException ! Please try to input again! ");
            } catch (NegativeNumberException e) {
                e.printStackTrace();
                System.out.println("NegativeNumberException ! Please try to input again! ");
            }
        }
    }

    public void  positiveNumber(int a) {
    }


    public static void main(String[] args) {
        Division  d=new Division();
        d.division();
    }


}
