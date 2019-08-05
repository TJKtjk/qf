package exceptiontask.task4;

import org.junit.Test;

/**
 * @author tjk
 * @date 2019/8/5 21:01
 */
public class BoatTest {


    //  正常
    @Test
    public void test1() {
        Boat boat = new Boat();
        boat.setMaxWeight(1000);
        int m = 300;
        try {
            boat.loading(m);
            m = 400;
            boat.loading(m);
            m = 200;
            boat.loading(m);
            m = 500;
            boat.loading(m);
        } catch (DangerException e) {
            System.out.println( e.warnMess());
            System.out.println("无法再装" + m + "吨的货物");
        } finally {
            System.out.println("货轮整点起航");
        }
    }


    // return
    @Test
    public void test2() {
        Boat boat = new Boat();
        boat.setMaxWeight(1000);
        int m = 300;
        try {
            boat.loading(m);
            m = 400;
            boat.loading(m);
            m = 200;
            boat.loading(m);
            m = 500;
            boat.loading(m);
            return ;
        } catch (DangerException e) {

            System.out.println( e.warnMess());
            System.out.println("无法再装" + m + "吨的货物");
        } finally {
            System.out.println("货轮整点起航");
        }
    }

    //   System.exit(0);
    @Test
    public void test3() {
        Boat boat = new Boat();
        boat.setMaxWeight(1000);
        int m = 300;
        try {
            boat.loading(m);
            m = 400;
            boat.loading(m);
            m = 200;
            boat.loading(m);
            m = 500;
            boat.loading(m);

            System.exit(0);

        } catch (DangerException e) {

            System.out.println( e.warnMess());
            System.out.println("无法再装" + m + "吨的货物");
        } finally {
            System.out.println("货轮整点起航");
        }
    }

    /**
     * 第五题  方式1
     * try(){
     * 代码语句；//  有可能发生异常的代码
     * ......
     * }catch(异常名 e){
     *  e.printStackTrace();
     *  }
     *   try/catch 语句的catch{} 必须对异常处理，输出或 保存到日志，一般保存到日志
     *
     *
     *
     *  方式2
     *  throws
     *   用法
     *  方法名()  throws 异常名{
     *
     *  }
     *
     *
     */


}
