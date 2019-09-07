package day0907HDFS.operationhdfs;

import org.apache.hadoop.fs.LocatedFileStatus;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.RemoteIterator;

import java.io.IOException;

public class GetFileInfo extends TestFileSystem {

    public static void main(String[] args) throws IOException {
        // 获取文件的详细属性
        RemoteIterator<LocatedFileStatus> listFile = fs.listFiles(new Path("/"), true);
        while (listFile.hasNext()) {
            LocatedFileStatus status = listFile.next();

            // 输出文件的详细信息

            // 输出文件的名称 S
            System.out.println(status.getPath().getName());

            // 输出文件的长度
            System.out.println(status.getLen());

            //输出文件的权限
            System.out.println(status.getPermission());

            // 输出文件的块大小
            System.out.println(status.getBlockSize());
        }
    }
}