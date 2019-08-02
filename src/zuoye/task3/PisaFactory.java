package zuoye.task3;

import java.util.Scanner;

/**
 * @author tjk
 * @date 2019/8/1 20:50
 */
public class PisaFactory {


    public   final   int N=2;
    public AbstractPisa getPisa(int id) {

        // 初始化 一个 AbstractPisa 对象
        AbstractPisa pisa = null;
        Scanner scanner = new Scanner(System.in);


        if (id == 1) {

            System.out.println("请输入完整的披萨名称: 培根披萨、海鲜披萨");
            String name = scanner.next();

            System.out.println("请输入披萨大小：");
            int size = scanner.nextInt();

            System.out.println("请输入披萨价格：");
            int price = scanner.nextInt();

            pisa = new BaconPizza(name, size, price);

            return pisa;
        }

        if (id == N) {
            System.out.println("请输入完整的披萨名称: 培根披萨、海鲜披萨");
            String name = scanner.next();

            System.out.println("请输入披萨大小：");
            int size = scanner.nextInt();

            System.out.println("请输入披萨价格：");
            int price = scanner.nextInt();

            pisa = new SeafoodPizza(name, size, price);

            return pisa;

        }

        return pisa;

    }


}
