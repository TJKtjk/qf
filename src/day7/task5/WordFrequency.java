package day7.task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author tjk
 * @date 2019/8/7 20:03
 */
public class WordFrequency {

    // 采用 key-value 的 Map 集合
     public   void findChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                //获取集合中c的value，重新存入++count
                Integer count = map.get(c);
                map.put(c, ++count);
            } else {
                //如果集合中无，直接存入
                map.put(c, 1);
            }
        }
        System.out.println(map);
    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    //有某个字符串集合，长度为10，给定字母a，统计集合中的字符串元素包含字母a的个数。


    public static void main(String[] args) {


        WordFrequency wordFrequency=new WordFrequency();
        wordFrequency.findChar("ababababab");




    }


}
