package day0907HDFS.operationhdfs;

import org.apache.hadoop.fs.Path;

import java.io.IOException;

public class RenameFile extends TestFileSystem {

    public static void main(String[] args) throws IOException {
        fs.rename(new Path("/b.txt"), new Path("/c.txt"));
        fs.close();
        System.out.println("修改完成");
    }
}