package day0907HDFS;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class HDFSWriteToFile {

    public static void main(String[] args) {
        try {
            Configuration conf = new Configuration();
            conf.set("fs.defaultFS", "hdfs://192.168.233.128:9000");
            conf.set("fs.hdfs.impl", "org.apache.hadoop.hdfs.DistributedFileSystem");

            FileSystem fs = FileSystem.get(conf);
            byte[] buff = "Hello world".getBytes();
            String filename = "/test.txt";

            FSDataOutputStream os = fs.create(new Path(filename));

            os.write(buff, 0, buff.length);

            System.out.println("Create:" + filename);

            os.close();
            fs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

