package day0907HDFS.operationhdfs;

import org.apache.hadoop.fs.Path;

import java.io.IOException;
public class DeleteFile extends TestFileSystem {

    public static void main(String[] args) throws IOException {
        fs.delete(new Path("/mytest"), true);
        fs.close();
        System.out.println("删除完成");
    }
}