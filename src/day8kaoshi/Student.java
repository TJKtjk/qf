package day8kaoshi;

import java.util.Scanner;

/**
 * @author tjk
 * @date 2019/8/9 16:24
 */
public class Student {


    //声明一个int型的数组，循环接收8个学生的成绩，计算这8个学生的总分及平均分、最高分和最低分

    public int gradeSum(int[] arr) {
        int average;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public int maxGrade(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public int minGrade(int[] arr) {
        int min = 100;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }


    public static void main(String[] args) {
        int[] array = new int[0];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            array[i] = sc.nextInt();

        }
        Student s = new Student();
        System.out.println("总分" + s.gradeSum(array));
        System.out.println(" 最高分 " + s.maxGrade(array));
        System.out.println(" 最低分" + s.minGrade(array));
        System.out.println(" 平均分" + s.gradeSum(array) / 8);

    }


}