package day2.classbox;

import org.junit.Test;

import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * @author tjk
 * @date 2019/8/2 10:04
 */
public class TestBox {

    @Test
    public void test() throws InterruptedException {
        Integer age = new Integer(10);
        System.out.println(age);

        Integer sum = 100;
        sum.doubleValue(); //

        int i = Integer.parseInt("10");


        Integer sum1 = Integer.parseInt("10");
        Integer sum2 = 100;
        System.out.println(sum1.equals(sum2));

//        public static Integer valueOf(int i) {
//            if (i >= Integer.IntegerCache.low && i <= Integer.IntegerCache.high)
//                return Integer.IntegerCache.cache[i + (-Integer.IntegerCache.low)];
//            return new Integer(i);
//        }
//        -127~128
        Integer.valueOf(100);

        boolean flag = Boolean.parseBoolean("wq");
        System.out.println("flag = " + flag);

        Date date = new Date();
        System.out.println("date = " + date);


        long time = date.getTime();
        System.out.println("time = " + time);


        // 测试代码执行时间
        long startTime = System.currentTimeMillis();

        Thread.sleep(100);
        long endTime = System.currentTimeMillis();

        long runTime = endTime - startTime;

//       yyyy-MM-dd hh-mm-ss

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 5);
        System.out.println("calendar = " + calendar);

        // 启动垃圾回收器，不要轻易用
//        System.gc();


    }

}
