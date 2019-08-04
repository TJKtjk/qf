package day2.kaoshi2;

import java.util.Arrays;

/**
 * @author tjk
 * @date 2019/8/3 19:19
 */
public class MyArrays {

    private String getString(String[] array) {
        return Arrays.toString(array);

    }

    public static void main(String[] args) {
        String[] arr = {"1", "2", "3", "4", "5"};
        MyArrays t = new MyArrays();

        System.out.println("t.getString(arr) = " + t.getString(arr));


    }
}
