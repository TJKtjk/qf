package day0827.task3;

import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author tjk
 * @date 2019/8/27 15:50
 */
public class DbcpTest {


    @Test
    public void test() throws IOException, SQLException {

        // 加载配置文件
        Properties properties = new Properties();
        InputStream resourceAsStream = DbcpTest.class.getClassLoader().getResourceAsStream("dbcp.properties");
        properties.load(resourceAsStream);

        //  创建 DataSource
        DataSource dataSource = null;
        try {
            dataSource = BasicDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 通过DataSource 得到数据库的连接
        Connection connection = dataSource.getConnection();
        System.out.println("connection = " + connection);


    }


}
