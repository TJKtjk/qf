package day0827.task2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author tjk
 * @date 2019/8/26 16:14
 */
public class SuperJdbc {
    static Connection connection = null;
    protected Statement statement;

    @BeforeClass
    public static void beforeClass() throws Exception {

        Properties properties = new Properties( );

        properties.load(new FileReader("E:\\IDEA workspace\\qf\\jdbc.properties"));

        String className = properties.getProperty("className");
        System.out.println("className = " + className);


//        Class.forName(className);
         Class.forName("com.mysql.cj.jdbc.Driver");


        String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=UTC";
        String username = "root";
        String password = "123456";

        connection = DriverManager.getConnection(url, username, password);

    }


    @Before
    public void before() throws Exception {
        statement = connection.createStatement();
    }

    @After
    public void test() throws Exception {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {

        }

    }

    @AfterClass
    public static void afterClass() throws Exception {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {

        }
    }


}

