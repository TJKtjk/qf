package day7.task4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tjk
 * @date 2019/8/7 19:44
 */
public class SumList {


    //随机生成20个整数，范围为10-30，存入到集合中，将所有元素加和后输出

    public static void main(String[] args) {


        List<Integer> list=new ArrayList< >(20);


        // 生成 20个 偶数
        int []num = new int[20];

        for (int i=0;i<20;i++) {
            num[i]=(int) (Math.random()*20+10);
            System.out.println("num = " + num[i]);
            list.add(num[i]);
        }


        // 输出
        int sum= 0;
        for (int i = 0; i < list.size(); i++) {
            sum = list.get(i)+sum;
        }
        System.out.println("sum = " + sum);
    }
}
