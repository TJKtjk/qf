package day0907HDFS.operationhdfs;

/**
 * @author tjk
 * @date 2019/9/6 21:18
 */


import org.apache.hadoop.fs.Path;

import java.io.IOException;

public class TestCopyFromLocal extends TestFileSystem {
    public static void main(String[] args) throws IOException {

        // 把本地磁盘中的文件 拷贝到HDFS上的根目录中
        fs.copyFromLocalFile(new Path("c:/product.txt"), new Path("/"));
        System.out.println("上传完毕");

    }
}