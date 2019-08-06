package exceptiontask.task4;

/**
 * @author tjk
 * @date 2019/8/5 20:53
 */
public class DangerException  extends Exception{
   private static final String INFO="警告！超重！！！";

     public String warnMess(){
         return INFO;
     }
}
