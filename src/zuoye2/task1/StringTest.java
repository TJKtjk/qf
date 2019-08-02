package zuoye2.task1;

import org.junit.Test;

/**
 * @author tjk
 * @date 2019/8/2 21:08
 */
public class StringTest{
    /**
     * 通过String"30" "300",分别用两种方式两个Integer类对象(两
     * 个30,两个300),并且比较两种方式的30 和300的地址是否相同,并说明
     * 为什么?
     */
 @Test
   public void test(){


     Integer num1=Integer.parseInt("30");
     Integer num2=Integer.parseInt("30");

     System.out.println("num1 = " + num1);
     System.out.println("num2 = " + num2);

     System.out.println(num1.equals(num2)); //true
     System.out.println(num1==(num2)); // true


     Integer num3=Integer.parseInt("300");
     Integer num4=Integer.parseInt("300");

     System.out.println("num3 = " + num3);
     System.out.println("num4 = " + num4);

     System.out.println(num3.equals(num4)); //true
     System.out.println(num3==(num4)); // false
 }


}
