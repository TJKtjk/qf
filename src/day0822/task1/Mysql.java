package day0822.task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Mysql {

    public static void main(String[] args) {


        Connection connect;
        Statement stmt;


        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // 加载 MYSQL JDBC驱动程序
            // Class.forName("org.gjt.mm.mysql.Driver");

            System.out.println("Success loading Mysql Driver!");
        } catch (Exception e) {
            System.out.print("Error loading Mysql Driver!");
            e.printStackTrace();
        }
        try {

            String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=UTC";
            String username = "root";
            String password = "123456";

            connect = DriverManager.getConnection(url, username, password);
            stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery("select * from bg");


//            while (rs.next()) {
//                String id = rs.getString("runoob_id");
//                System.out.println(id);
//            }

            while (rs.next()){
                System.out.println(rs.getInt(1)+"\t"+
                        rs.getString(2)+"\t"+rs.getString(3)+
                        "\t"+rs.getString(4) + "\t"
                );
            }



        } catch (Exception e) {
            System.out.print("get data error!");
            e.printStackTrace();
        }

    }

}
