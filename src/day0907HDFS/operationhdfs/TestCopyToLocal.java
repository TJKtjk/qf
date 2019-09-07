package day0907HDFS.operationhdfs;

/**
 * @author tjk
 * @date 2019/9/6 21:18
 */

import org.apache.hadoop.fs.Path;

import java.io.IOException;

public class TestCopyToLocal extends TestFileSystem {

    public static void main(String[] args) throws IOException {

        fs.copyToLocalFile(true, new Path("/a.txt"), new Path("c:/vvvvb.txt"));
        fs.close();
    }


}