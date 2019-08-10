package multithreading.task1;

/**
 * @author tjk
 * @date 2019/8/10 9:41
 */
public class MainTest {

    //  主线程
    public static void main(String[] args) {

        ThreadTest1 t1;
        ThreadTest2 t2;

        //  在主线程 main方法 中创建2条其他线程
        t1=new ThreadTest1();
        t2=new ThreadTest2();

        // 启动着两条线程
        t1.start();
        t2.start();

        // 验证主线程 的for 语句执行过程
        for (int i = 1; i <=20 ; i++) {
            System.out.println("大家好"+i+"\t");

        }


    }
}
