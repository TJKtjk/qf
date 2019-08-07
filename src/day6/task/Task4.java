package day6.task;

/**
 * @author tjk
 * @date 2019/8/6 19:57
 */
public class Task4 {
    public static void main(String[] args) {

        String number = "0755-12345443";

        String number1 = "0776-123454438888888888";
        String number2 = "0771-88808880";


        boolean  a = number.matches( "0[1-9]{3}-[0-9]{8}" );
        boolean  b = number1.matches( "0[1-9]{3}-[0-9]{8}" );
        boolean  c = number2.matches( "0[1-9]{3}-[0-9]{8}" );

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);


    }


}
