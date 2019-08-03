package zuoye2.task2;

/**
 * @author tjk
 * @date 2019/8/3 11:06
 */
public class EnvSum {
    /**
     * 计算1到100000之间偶数的和,并且是在200的整数倍的时候用红
     * 色在控制台打印出来,并且计算出这段代码的执行时间
     *
     * @param args
     */
    public static void main(String[] args) {

        // 测试代码执行时间
        long startTime = System.currentTimeMillis();


        int sum = 0;
        for (int i = 0; i < 10_0000; i++) {
            if (i % 2 == 1) {
                continue;
            }
            sum += i;
            if (sum % 200 == 0) {
                System.err.println("sum = " + sum);
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("endTime = " + endTime);
        System.out.println("startTime = " + startTime);

        long runTime = endTime - startTime;
        System.out.println("runTime = " + runTime);
    }

}
