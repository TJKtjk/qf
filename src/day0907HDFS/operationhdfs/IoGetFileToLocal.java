package day0907HDFS.operationhdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author tjk
 * @date 2019/9/7 10:05
 */
public class IoGetFileToLocal {

    public static void main(String[] args) throws URISyntaxException, IOException {

        // 1 连接
        Configuration conf =new Configuration();

        //2、获取
        FileSystem fs =FileSystem.get(new URI("hdfs://master:8020"),conf);

        //3、 获取输入流
        FSDataInputStream input =fs.open(new Path("/gg.txt"));

        //4、获取输出流
        FileOutputStream out=new FileOutputStream(new File("c:/gg.txt"));

        // 流拷贝
        IOUtils.copyBytes(input,out,conf);

        //关闭流
        IOUtils.closeStream(input);
        IOUtils.closeStream(out);

        System.out.println("上传完毕");









    }

}
