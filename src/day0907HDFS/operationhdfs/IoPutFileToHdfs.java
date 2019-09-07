package day0907HDFS.operationhdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;
import org.apache.hadoop.fs.permission.FsPermission;
import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.util.Progressable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author tjk
 * @date 2019/9/7 10:04
 */
public class IoPutFileToHdfs   {

    public static void main(String[] args) throws IOException, URISyntaxException {

        // 1、创建连接
        Configuration conf = new Configuration();

        // 2、获取文件系统
        FileSystem fs=  FileSystem.get(new URI("hdfs://master:8020"),conf);

        //3、创建输入流，读取输入文件
        FileInputStream input = new FileInputStream(new File("c://a.txt"));

        // 创建输出流
        FSDataOutputStream out = fs.create(new Path("/gg.txt"));

        //IO的流拷贝
        IOUtils.copyBytes(input, out, conf);

        //关闭资源
        IOUtils.closeStream(input);
        IOUtils.closeStream(out);

        System.out.println("上传完毕");
    }
}
