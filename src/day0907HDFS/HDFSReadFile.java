package day0907HDFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.FSDataInputStream;

public class  HDFSReadFile{
    public static void main(String args[]) {
        try {
            Configuration conf = new Configuration();
            conf.set("fs.defaultFS","hdfs://192.168.233.128:9000");
            conf.set("fs.hdfs.impl","org.apache.hadoop.hdfs.DistributedFileSystem");

            FileSystem fs = FileSystem.get(conf);
            Path file = new Path("/input/input.txt");
            FSDataInputStream getIt = fs.open(file);

            BufferedReader d = new BufferedReader(new InputStreamReader(getIt));
            String content = d.readLine();
            System.out.println(content);
            d.close();
            fs.close();
        } catch (Exception e) {
                e.printStackTrace();
        }
    }
}


