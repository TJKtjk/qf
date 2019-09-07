package day0908MapReduce.mapreduce;

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

/*
 *  windows Eclipse 运行MapReduce
 *  需要将含有  winutils.exe  hadoop.dll 的文件夹加入到系统环境变量
 *  windows hosts文件需要IP映射   192.168.43.128  master
 *  Windows System32下 需要有hadoop.dll
 *  Eclipse 工程项目导入hadoop2.7.1的jar包
 *  /usr/local/hadoop/share/hadoop/common/
 *  /usr/local/hadoop/share/hadoop/common/lib
 *  /usr/local/hadoop/share/hadoop/mapreduce
 *  /usr/local/hadoop/share/hadoop/mapreduce/lib
 *  /usr/local/hadoop/share/hadoop/yarn/*.jar 
 * 
 */

public class WordCountLocal {

	private static class WordCountMapper extends Mapper<Object, Text, Text, IntWritable> {

		@Override
		protected void map(Object key, Text value, Mapper<Object, Text, Text, IntWritable>.Context context)
				throws IOException, InterruptedException {

			String lineStr = value.toString();

			
			//  hello word 
			// result[0]=hello result[1]=word
			
			String result[] = lineStr.split(" ");

			for (int x = 0; x < result.length; x++) {
				
                           //         (  (hello),1  )
				           //         (  (word),1  )
				context.write(new Text(result[x]), new IntWritable(1));

				System.out.print("===========map==========");
				System.out.println(result[x]+ "  1");

			}
		}
	}

private static class WordCountReducer extends Reducer<Text, IntWritable, Text, IntWritable> {

	@Override
protected void reduce(Text key, Iterable<IntWritable> values, Reducer<Text, IntWritable, Text, IntWritable>.Context context)
				throws IOException, InterruptedException {

			int sum = 0;
			for (IntWritable count : values) {
				sum += count.get();
			}
			System.out.println("=========reduce==========");
			context.write(key, new IntWritable(sum));
		}
	}

	public static void main(String args[]) throws Exception {

		Configuration conf = new Configuration();

		// 每次运行自动删除输出目录
 	Path outputPath = new Path("./output1");
 	outputPath.getFileSystem(conf).delete(outputPath, true);

		// 本地运行， 不需要下面两行
		// conf.set("mapred.job.tracker", "hadoopmaster:9001");
		// conf.set("fs.defaultFS", "hdfs://192.168.43.127:9000");

		Job job = Job.getInstance(conf);
		job.setJarByClass(WordCountLocal.class);

		job.setMapperClass(WordCountMapper.class);
		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(IntWritable.class);

		
		// 运行Reduce合并
		job.setReducerClass(WordCountReducer.class);
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);

		// FileInputFormat  路径可以是一个文件、一个目录，或者一个相对路径
		FileInputFormat.addInputPath(job, new Path("input.txt"));
		FileOutputFormat.setOutputPath(job, new Path("output1"));
		
		
		System.out.println("start");
		job.waitForCompletion(true);
		System.out.println("Done");

	}
}
