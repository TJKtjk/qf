package day6.task;

import org.junit.Test;

/**
 * @author tjk
 * @date 2019/8/6 18:58
 */
public class Task2 {
    /**
     * 曾经学习过对数组的元素进行反转。
     * 将字符串变成数组，对数组反转。
     * 将反转后的数组变成字符串。
     * 只要将或反转的部分的开始和结束位置作为参数传递即可。
     */
    public String myreverse1(String str, int startIndex, int endIndex) {
        if (str != null && str.length() != 0) {

            // 转化
            char[] arr = str.toCharArray();

            for (int x = startIndex, y = endIndex; x < y; x++, y--) {
                char temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
            }
            return new String(arr);
        }
        return null;
    }

    public String myreverse2(String str, int startIndex, int endIndex) {
        if (str != null) {
            StringBuilder builder = new StringBuilder(str.length());

            // 第一部分 0 到 start 加入 append
            builder.append(str.substring(0, startIndex));

            //第二部分
            for (int i = endIndex; i >= startIndex; i--) {
                builder.append(str.charAt(i));
            }

            //第三部分
            builder.append(str.substring(endIndex + 1));

            return builder.toString();
        }
        return null;
    }

    @Test
    public void test() {

        String s1 = "abcdefg";


        Task2 task2 = new Task2();
        String s2 = task2.myreverse1(s1, 2, 5);
        System.out.println("s2 = " + s2);
    }


}
