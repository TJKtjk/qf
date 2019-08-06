package exceptiontask.task2;

import org.junit.Test;

/**
 * @author tjk
 * @date 2019/8/5 19:23
 */
public class ExceptionHandle {


    private void run() {
        run();
    }


    @Test
    public void test() throws OutOfMemoryError {

        // StackOverflowError
        while (true) {
            run();
        }

        //  OutOfMemoryError: Java heap space
//        while (true) {
////            Animal t=new Animal();
////            t.setName("dog");
//
//        }
    }


    // NullPointerException(NPE)
    @Test
    public void test3(){
        String a=null;
        System.out.println( "a = " + a.length() );

    }

    //ClassCastException
//    @Test
    public void test2(){
        Object t = new ExceptionHandle();
        Animal animal = (Animal) t;
        animal.setName("dog");
    }
}
