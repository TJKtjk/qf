package day0908MapReduce.task2;

import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.io.IntWritable;
/**
 * @author tjk
 * @date 2019/9/7 11:00
 */
public class MapReduceKaiFa {

    private static class MyMapper extends Mapper<Object, Text, Text, IntWritable> {

        @Override
        protected void map(Object key, Text value, Mapper<Object, Text, Text, IntWritable>.Context context)
                throws IOException, InterruptedException {

            String str = value.toString();

            String result[] = str.split(" ");

            for (int x = 0; x < result.length; x++) {

                int i = Integer.parseInt(result[x]);
                context.write(new Text("sum"), new IntWritable(i));

                System.out.print(" map 完成");
                System.out.println();


            }

        }
    }



    private static class MyReduce extends Reducer<Text, IntWritable, Text, IntWritable> {

            @Override
protected void reduce(Text key, Iterable<IntWritable> values, Reducer<Text, IntWritable, Text, IntWritable>.Context context) throws IOException, InterruptedException {

                int sum = 0;
                for (IntWritable count : values) {
                    sum += count.get();
                }
                System.out.println("=========reduce==========");
                context.write(key, new IntWritable(sum));
            }

        }


        public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
            Configuration conf = new Configuration();

            // 每次运行自动删除输出目录
            Path outputPath = new Path("./output");
            outputPath.getFileSystem(conf).delete(outputPath, true);

            Job job = Job.getInstance(conf);
            job.setJarByClass(MapReduceKaiFa.class);

            job.setMapperClass(MyMapper.class);
            job.setMapOutputKeyClass(Text.class);
            job.setMapOutputValueClass(IntWritable.class);


            // 运行Reduce合并
            job.setReducerClass(MyReduce.class);
            job.setOutputKeyClass(Text.class);
            job.setOutputValueClass(IntWritable.class);


            FileInputFormat.addInputPath(job, new Path("1.txt"));
            FileOutputFormat.setOutputPath(job, new Path("output"));


            System.out.println("start");
            job.waitForCompletion(true);
            System.out.println("Done");
        }

    }

