package multithreading.task2;

/**
 * @author tjk
 * @date 2019/8/10 14:10
 */
public class RunnableTest implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"Runnable is running");

    }

    public static void main(String[] args) {

        // RunnableTest 实现了一个接口， 要依赖于Thread() 方法，才能启动

        //  new Thread( new RunnableTest() ).start();

        // 与 上一句 等价 ，依赖于Thread
        RunnableTest rt=new RunnableTest();
        Thread t=new Thread(rt);
        t.start();

          // 给线程 设置名字
//        Thread.currentThread().setName(s);
//        Thread.currentThread().getName(s);
    }


}
