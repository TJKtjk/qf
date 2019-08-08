package day7.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tjk
 * @date 2019/8/7 18:21
 */
public class Test1 {
    //有整型数组，内部元素为1到10，将数组中的元素倒序插入ArrayList中，并遍历输出结果。

    public static void main(String[] args) {

        int []arr={1,2,3,4,5,6,7,8,9,10};

        List<Integer> list=new ArrayList();

        for (int i = arr.length-1; i >=0 ; i--) {
            list.add(arr[i]);
        }

        // foreach 遍历
        for (int  o:list
             ) {
            System.out.println("o = " + o);
        }




    }
}
