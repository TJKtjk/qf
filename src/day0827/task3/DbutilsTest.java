package day0827.task3;

import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

/**
 * @author tjk
 * @date 2019/8/27 17:03
 */
public class DbutilsTest {


    private static DataSource dataSource;
    QueryRunner queryRunner;


    @BeforeClass
    public static void before() throws IOException {

        // 加载配置文件
        Properties properties = new Properties();
        InputStream resourceAsStream = DbutilsTest.class.getClassLoader().getResourceAsStream("dbcp.properties");
        properties.load(resourceAsStream);

        //  创建 DataSource
        try {
            dataSource = BasicDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    @Test
    public void test() throws SQLException {
        queryRunner = new QueryRunner(dataSource);

        Student stu = queryRunner.query("select * from student", new BeanHandler<Student>(Student.class));
        System.out.println("stu = " + stu);

//        // 根据学生对应的老师的编号 查学生,测试方法
//        List<Student> list = queryRunner.query("select * from student where sid in (select sid from stuteacher where tid='04')", new BeanListHandler<Student>(Student.class));
//        for (Student stu : list) {
//            System.out.println("stu = " + stu);
//        }
    }


    /**
     * 学生增删改查
     *
     * @throws Exception
     */
    @Test
    public void testStudent() throws SQLException {
        queryRunner = new QueryRunner(dataSource);

        // 查询 一名学生
        Student stu = queryRunner.query("select * from student", new BeanHandler<Student>(Student.class));
        System.out.println("stu = " + stu);

        // 根据学生对应的老师编号 查学生
        Student user1 = queryRunner.query("select * from student where sid=(select sid from stuteacher where tid='04')", new BeanHandler<Student>(Student.class));
        System.out.println("user1 = " + user1);


        // 新增一名插班生
        queryRunner.update(" Insert into  student  values (11,'10','小红',15,'bg1903','07')");


        dataSource.getConnection().setAutoCommit(false);
        try {
            //  删除一名学生,不存在id,不成功则回滚
            queryRunner.update(" delete from student where id='04'");
            dataSource.getConnection().commit();
        } catch (SQLException e) {
            dataSource.getConnection().rollback();
            e.printStackTrace();
        }


        // 学生更换班级
        queryRunner.update(" update student set banji='bg1904',set tid='01' where sid='08' and name='王菊'");

    }


    /**
     * 老师 增删改查
     *
     * @throws Exception
     */
    @Test
    public void testTeacher() throws SQLException {
        queryRunner = new QueryRunner(dataSource);

        // 查询 一名老师
        Teacher teacher = queryRunner.query("select * from teacher where tname='王老师'", new BeanHandler<Teacher>(Teacher.class));
        System.out.println("teacher = " + teacher);


        // 根据学 老师 所教的学生的编号  查老师
        List<Teacher> list = queryRunner.query("select * from teacher where tid in (select tid from stuteacher where sid='04')", new BeanListHandler<Teacher>(Teacher.class));
        for (Teacher tea : list) {
            System.out.println("user = " + tea);
        }


        //      新增一名老师
        queryRunner.update(" Insert into  teacher  values (17,'10','黄老师')");

        // 学生退休，删除一名老师
        queryRunner.update(" delete from teacher where id=3");

        // 老师姓氏有错，需要更换
        dataSource.getConnection().setAutoCommit(false);
        try {
            queryRunner.update(" update  teacher set  tname='黎老师' where tname='李老师'");

            dataSource.getConnection().commit();
        } catch (SQLException e) {

            //如果没有 黎老师，则回滚
            dataSource.getConnection().rollback();
            e.printStackTrace();
        }
    }

    @Test
    public void testScore() throws SQLException {
        queryRunner = new QueryRunner(dataSource);

        // 成绩表漏了一个学生的一科成绩
        queryRunner.update("insert into score values (5,'04',79,'English') ");

        // 发现学生作弊，删除学生成绩
        queryRunner.update(" delete from score where sid='03' ");

        //  勉强给学生及格
        queryRunner.update(" update score set score=60 where sid='02'");


        // 查询多条记录
        List<Score> list = queryRunner.query("select  * from score ", new BeanListHandler<Score>(Score.class));
        for (Score score : list) {
            System.out.println("score = " + score);
        }

    }


}
