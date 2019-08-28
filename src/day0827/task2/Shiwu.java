package day0827.task2;

import org.junit.Test;

import java.sql.SQLException;

/**
 * @author tjk
 * @date 2019/8/27 11:49
 */
public class Shiwu extends SuperJdbc {

     @Test
     public void Shiwu()throws Exception{

         // 1、自动提交 。开启事务
         connection.setAutoCommit(false);

         // 2 执行业务，没有提交，不会持久化到数据库
         try {
             int i = statement.executeUpdate(" UPDATE bg set name='sansan' where sid=2 ;");
             System.out.println("i = " + i);

             // 第三步
             connection.commit();

         } catch (SQLException e) {

             // 发生异常， 回滚 ，所有数据不保存
             connection.rollback();

             e.printStackTrace();
         }












     }

}
