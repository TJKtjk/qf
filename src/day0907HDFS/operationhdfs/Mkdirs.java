package day0907HDFS.operationhdfs;

import org.apache.hadoop.fs.Path;
import java.io.IOException;

public class Mkdirs extends TestFileSystem{

    public static void main(String[] args) throws IOException {
        fs.mkdirs(new Path("/mytest"));
        fs.close();
        System.out.println("创建完成");
    }
}
