package day6.task;

/**
 * @author tjk
 * @date 2019/8/6 21:34
 */
public class Task5 {

    /*
        EAN-13标准条形码最后一位校验码的计算步骤如下：
        a、从代码位置序号2开始，所有偶数位的数字代码求和。
        b、将步骤a的和乘以3。
        c、从代码位置序号3开始，所有奇数位的数字代码求和。
        d、将步骤b与步骤c的结果相加。
        e、用大于或等于步骤d所得结果且为10最小整数倍的数减去步骤d所得结果，其差即为所求校验码的值。
        解释： EAN-13标准条形码代码位置从右到左序号
        13   12   11   10   9   8   7   6   5   4   3   2   1
     */

    public boolean isBarCode(String s) {
        return  s.matches("[0-9]{13}");
    }

    private boolean isEven(int x) {
        return x % 2 == 0;
    }

    public void checkBarCode(String s) {

        char[] ch = s.toCharArray();

        int enevSum = 0;
        int oddSum = 0;


        if (!isBarCode(s)) {
            System.out.println("验证条码错误");
        }
        for (int i = 0; i < ch.length - 1; i++) {

            int num = ch[i] - '0';
            System.out.println("num = " + num);

            //  i 是偶数
            if (isEven(i)) {
                // 奇数和
                oddSum += num;
            } else {
                // 偶数和
                enevSum += num;
            }
        }

        int sum = oddSum + enevSum * 3;

        int unit = sum % 10;


        int identifyingCode;

        System.out.println("unit = " + unit);


        if (unit == 0) {
            identifyingCode = 0;
        } else {
            identifyingCode = 10 - unit;
        }

        System.out.println(" 验证位 identifyingCode = " + identifyingCode);

        if (identifyingCode == (ch[12]) - '0') {
            System.out.println("ean-13条码的 验证码正确");
        } else {
            System.out.println("ean-13条码的 验证码错误");
        }

    }


    public static void main(String[] args) {
        Task5 task5 = new Task5();
        task5.checkBarCode("6901234567892");
    }
}
