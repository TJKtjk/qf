package day0908MapReduce.mapreduce;

/* 
 * 
 *  确保windows 的hosts 文件包含 ip
 *  
 */

import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;
import org.apache.hadoop.io.IntWritable;

public class WordCount {
	
	/**
	 * 	
	 * Object: 输入数据的具体内容
	 * Text：每行的文本数据
	 * Text：每个单词分解后的统计结果
	 * IntWritable：输出记录的结果
	 */

	private static class WordCountMapper extends Mapper<Object,Text,Text,IntWritable>{

		 //进行Map处理
		@Override
protected void map(Object key, Text value, Mapper<Object, Text, Text, IntWritable>.Context context) throws IOException, InterruptedException {
			
			String lineContent = value.toString();
		
			String result[] = lineContent.split(" ");
			for(int x=0; x < result.length ; x++) {
			
				context.write(new Text(result[x]), new IntWritable(1));
			}
 		}
	}
	
	/**
	 * reduce处理
	 * Text: Map输出的文本内容
	 * IntWritable：Map处理的个数
	 * Text：Reduce输出文本
	 * IntWritable：Reduce的输出个数
	 */
	private static class WordCountReducer extends Reducer<Text, IntWritable, Text, IntWritable>{
		@Override
protected void reduce(Text key, Iterable<IntWritable> values, Reducer<Text, IntWritable, Text, IntWritable>.Context context) throws IOException, InterruptedException {
		
			int sum = 0;

			for(IntWritable count: values) {
				sum += count.get();
			}
			context.write(key, new IntWritable(sum));
		}
	}
	
	public static void main(String args[]) throws Exception{
		if(args.length != 2) {
			System.out.println("Usage: hadoop jar filename.jar input_filename.txt output_path");
			System.exit(1);
		}
		
		Configuration conf = new Configuration();
		String [] argArray = new GenericOptionsParser(conf,args).getRemainingArgs();
	
		Job job = Job.getInstance(conf, "WordCount");
		job.setJarByClass(WordCount.class);
		
	
		job.setMapperClass(WordCountMapper.class);
		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(IntWritable.class);
		
	
		job.setReducerClass(WordCountReducer.class);
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		
	     /*两个参数  hadoop jar WordCount.jar  /input/input.txt   /output     */
		
		FileInputFormat.addInputPath(job, new Path(argArray[0])); // 输入
		FileOutputFormat.setOutputPath(job, new Path(argArray[1]));  //输出
		System.exit(job.waitForCompletion(true) ? 0:1 );
		
		
	}
}