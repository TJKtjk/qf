package zuoye2.task1;

/**
 * @author tjk
 * @date 2019/8/3 8:40
 */
public class TypeChange {
    public static void main(String[] args) {
        /**
         * 通过代码演示基本类型,对象类型,字符串类型两两之间的相互转
         * 化
         */

        //    字符串  转  对象类型  String --> Integer
        String str="123";
        Integer b=Integer.parseInt(str);
        System.out.println("b = " + b);


        // 对象类型  转 字符串  Integer->String
        Integer i2=100;
        String s1=Integer.toString(i2);
        System.out.println("对象 转 字符串："+ s1);




       //   对象类型   转 int 类型
        Integer b1=new Integer(5);
        int a=b1.intValue();
        System.out.println("a = " + a);


        // int类型  转 对象类型
        int i3=100;
        Integer i4=i3;
        System.out.println("i4 = " + i4);


        //把字符串 转化  int基本类型  String->int
        int s2 = Integer.parseInt( "10" );
        System.out.println("s2 = " + s2);


        // int基本类型  转 字符串  int->String
        int i5=10;
        String s3=Integer.toString(i5);
        System.out.println("s3 = " + s3);


    }
}
