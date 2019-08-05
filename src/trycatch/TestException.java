package trycatch;

import org.junit.Test;

/**
 * @author tjk
 * @date 2019/8/5 11:32
 */
public class TestException {

    @Test
    public void testException() {

    }

    @Test
    public void test() {

        String[] arr;
        String name=null;

        if (name != null) {
            System.out.println("name = " + name.length());
        }


         try {
             System.out.println("arr.length = " + name.length());
         }catch (Exception e){
             e.printStackTrace();
         }

         try {

         }catch ( Exception e){

         }
//         catch (SqlException e){
//
//         }







    }

}
