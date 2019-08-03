package zuoye2.task2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author tjk
 * @date 2019/8/3 9:28
 */
public class PrintBirthday {

//    public void func() {
//        Date date = new Date();
//        //SimpleDateFormat对当前Date进行格式化
//
//}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个日期");

        System.out.println("请输入年：xxxx");
        int  year = sc.nextInt();

        System.out.println("请输入月：xx");
        int  month=sc.nextInt();

        System.out.println("请输入日：xx");
        int  day =sc.nextInt();

//        Date date=new Date();

        System.out.println("小明的生日：  " +  year+"/"+month+"/"+day);

        Calendar calendar=Calendar.getInstance();

        calendar.set(Calendar.DAY_OF_YEAR,year);
        calendar.set( Calendar.DAY_OF_MONTH,month );
        calendar.set( Calendar.DATE,day);

        //对日期进行加减
        calendar.add( Calendar.DAY_OF_MONTH,5);


        //把Calendar转化为Date
        Date date = calendar.getTime();

        //SimpleDateFormat对转化的Date进行格式化
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");

        //把Date格式化后输出
        String format = simpleDateFormat.format( date );
        System.out.println( " 小李的生日   " + format );


       int xingqiji= calendar.get(Calendar.DAY_OF_WEEK);

        ////1.数组下标从0开始；2.老外的第一天是从星期日开始的
       String []arr={"星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
        System.out.println("小李的生日是："+arr[xingqiji-1]);



    }
}
