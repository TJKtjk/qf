package day0820.task2;

/**
 * @author tjk
 * @date 2019/8/20 16:20
 */
public class LiuJingJi implements Meeting {

    private Meeting liudehua = new Liu();


    @Override
    public void meet(int money) {
        if (money > 100) {
            liudehua.meet(100);
        } else {
            System.out.println("liu出差");
        }
    }
}
