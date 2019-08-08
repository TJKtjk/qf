package day8;



import java.util.Comparator;
import java.util.Objects;

/**
 * @author tjk
 * @date 2019/8/8 15:35
 */
public class JinCat implements Comparable {


    private String name;
    private int age;

    public JinCat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public int compareTo(Object o) {
        //判断两个对象是否是同一个对象
        if (this == o) {
            return 0;
        }

//      判断当前传入的比较对象是不是JinDog类型
        if (o instanceof JinCat) {
            JinCat dog = (JinCat) o;
            //用来指定排序规则
            if (this.getAge() > dog.getAge()) {
                return 1;
            } else if (this.getAge() < dog.getAge()) {
                return -1;
            } else {
                return  this.getName().compareTo( dog.getName() );
            }
        }

        return 0;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
        { return true; }
        if (o == null || getClass() != o.getClass())
        { return false; }
        JinCat jinCat = (JinCat) o;
        return age == jinCat.age &&
                Objects.equals(name, jinCat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "JinCat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}