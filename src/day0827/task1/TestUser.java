package day0827.task1;

import org.junit.Test;

/**
 * @author tjk
 * @date 2019/8/27 10:47
 */
public class TestUser {


    public static void main(String[] args) {
        User user=new User();
        user.setId(10);
        user.setName("lisi");
        user.setPassword("123");
        user.setAddress("深圳");

        System.out.println("user = " + user);
    }



}
