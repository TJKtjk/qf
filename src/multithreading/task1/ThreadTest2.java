package multithreading.task1;

/**
 * @author tjk
 * @date 2019/8/10 8:48
 */
public class ThreadTest2 extends Thread {

    @Override
    public void  run(){
        for (int i = 1; i <=20 ; i++) {
            System.out.println("我很好"+i+"\t");
        }

    }

}
