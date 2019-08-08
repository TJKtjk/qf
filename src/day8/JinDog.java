package day8;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author tjk
 * @date 2019/8/8 15:57
 */
public class JinDog implements Comparator {



    public static void main(String[] args) {

        Set set = new TreeSet();
        set.add( new JinDog() );


    }


    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    //  局部内部类 实现 比较器
    class JinCatTest implements Comparator<JinCat> {
        @Override
        public int compare(JinCat o1, JinCat o2) {
            return (o1.getName().compareTo( o2.getName() ) == 0) ? (Integer.compare( o1.getAge(), o2.getAge() )) : o1.getName().compareTo( o2.getName() );
        }
    }








}
