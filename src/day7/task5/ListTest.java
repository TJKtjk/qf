package day7.task5;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author tjk
 * @date 2019/8/7 20:25
 */
public class ListTest {

// 写代码证明LinkedList和ArrayList,新增,删除,查找方面的速度差距,用实际时间来证明


    public void testArraryList(int number) {

        ArrayList<ListTest> list = new ArrayList< >();
        /*
         * 添加测试
         */
        Long start = System.currentTimeMillis();
        for (int i = 0; i < number; i++) {
            list.add(new ListTest());
        }
        Long end = System.currentTimeMillis();
        System.out.println("add：" + number + "个对象耗时" + (end - start));

        /*
         * 查找测试
         */
        start = System.currentTimeMillis();
        for (int i = 1; i < number; i = i * 10) {
//			list.indexOf(i);//查找1、10、100..的数据

            list.indexOf(i);

        }
        end = System.currentTimeMillis();
        System.out.println("search：" + number + "个对象耗时" + (end - start));



        /*
         * 删除测试
         */
        int size;
        //计算删除的个数
        int time=number/1000000<1000?1000:number/1000000;
        if(time>number)
        {time=number-1;}

        start=System.currentTimeMillis();
        for(int i=0;i<time;i++){
//			size=list.size()/2;//从中间删除

            size=(int)(Math.random()*list.size());
            list.remove(size);
        }
        end=System.currentTimeMillis();

        System.out.println("remove："+time+"个对象耗时"+(end-start));

    }




    public void linkedListTest(int number) {

        LinkedList<ListTest> list = new LinkedList< >();
        /*
         * 添加测试
         */
        Long start = System.currentTimeMillis();
        for (int i = 0; i < number; i++) {
            list.add(new ListTest());
        }
        Long end = System.currentTimeMillis();
        System.out.println("add：" + number + "个对象耗时" + (end - start));

        /*
         * 查找测试
         */
        start = System.currentTimeMillis();
        for (int i = 1; i < number; i = i * 10) {
//			list.indexOf(i);//查找1、10、100..的数据

            list.indexOf(i);
        }
        end = System.currentTimeMillis();
        System.out.println("search：" + number + "个对象耗时" + (end - start));



        /*
         * 删除测试
         */

        int size;
        //计算删除的个数
        int time=number/1000000<1000?1000:number/1000000;
        if(time>number)
        {time=number-1;}

        start=System.currentTimeMillis();
        for(int i=0;i<time;i++){
//			size=list.size()/2;//从中间删除
            size=(int)(Math.random()*list.size());
            list.remove(size);
        }
        end=System.currentTimeMillis();

        System.out.println("remove："+time+"个对象耗时"+(end-start));




    }


    public static void main(String[] args) {

        ListTest listTest=new ListTest();
        System.out.println("testArraryList");
        listTest.testArraryList(100000);


        System.out.println("==============");
        System.out.println( "LinkedList");
        listTest.linkedListTest(100000);



    }
}
