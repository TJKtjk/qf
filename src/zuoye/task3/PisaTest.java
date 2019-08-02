package zuoye.task3;

import java.util.Scanner;

/**
 * @author tjk
 * @date 2019/8/1 19:32
 */
public class PisaTest {



    public static void main(String[] args) {



        Scanner scanner=new Scanner(System.in);

        System.out.println("请输入菜单编号：");
        int num =scanner.nextInt();

         AbstractPisa pisa=new PisaFactory().getPisa(num);
         pisa.show();

        System.out.println(pisa.show());;





    }
}
