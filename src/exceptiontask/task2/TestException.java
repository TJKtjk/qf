package exceptiontask.task2;

import org.junit.Test;

/**
 * @author tjk
 * @date 2019/8/5 19:23
 */
public class TestException {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void run() {
         run();
    }


    @Test
    public void test() {

        // StackOverflowError
        while (true) {
            run();
        }

        //  OutOfMemoryError: Java heap space
//        while (true) {
////            TestException t=new TestException();
////            t.setAge(12);
//
//        }
    }


    // NullPointerException(NPE)
    @Test
    public void test3() {
        String a=null;
        System.out.println( "a = " + a.length() );

    }


    //ClassCastException
    @Test
    public void test2() {
        Object t = new TestException();
        Thread tt = (Thread) t;
    }


}

