package day0907HDFS.operationhdfs;

/**
 * @author tjk
 * @date 2019/9/6 21:18
 */
import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;

public class TestFileSystem {
       static FileSystem fs;
     public static void hdfsCommon() throws IOException {
         // 首先连接HDFS 之前，需要获得一个配置类，用于封装连接信息
         Configuration conf=new Configuration();

         // 课题通过set的方法，设置属性与内容（连接HDFS 的一些相关信息）
         conf.set("fs.defaultFS", "hdfs://192.168.233.128:9000");

         // 获得文件系统 可以理解为客户端的概念
           fs =FileSystem.get(conf);

         //  System.out.println(fs);
     }

}