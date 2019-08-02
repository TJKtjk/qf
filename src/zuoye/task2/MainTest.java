package zuoye.task2;

/**
 * @author tjk
 * @date 2019/8/1 19:10
 */
public class MainTest {


    public static void main(String[] args) {

        Computer   computer=new Computer(new Ati());
        computer.setBrand("Ati");


        computer=new Computer(new Geforce());
        computer.setBrand("Geforce");


    }
}
