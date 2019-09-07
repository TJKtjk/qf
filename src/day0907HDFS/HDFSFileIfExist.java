package day0907HDFS;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class HDFSFileIfExist {
    public static void main(String[] args){
        try{
            String fileName = "/input/intput.txt";
            Configuration conf = new Configuration();
            conf.set("fs.hdfs.impl", "org.apache.hadoop.hdfs.DistributedFileSystem");

            conf.set("fs.defaultFS", "hdfs://192.168.233.128:9000");
            FileSystem fs = FileSystem.get(conf);

            if(fs.exists(new Path(fileName))){
                System.out.println("file is exitss ");
            }else{
                System.out.println("file is  not exits ");
            }
 
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}


 













