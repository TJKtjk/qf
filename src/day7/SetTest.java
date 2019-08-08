package day7;

import day31.Dog;
import org.junit.Test;

import java.util.*;

/**
 * @author tjk
 * @date 2019/8/7 11:27
 */

public class SetTest {
    @Test
    public void testCollection() {
        //在集合声明的时候,都是接口声明,子类实现,扩展性比较强
        //等号左边声明的变量称之为编译期变量,等号右边创建的变量是运行期变量
        Collection collection = new ArrayList();
        collection.add(new Object());
        collection.add(new Person("zhang"));

        //在打印一个Collection时,默认打印的是集合里面所有元素对象的toString方法产生的值
        System.out.println("collection = " + collection);

        Collection subCollection = new ArrayList();
        subCollection.add("123");
        subCollection.add("345");
        subCollection.add("678");

        //集合里面添加集合
        collection.addAll(subCollection);
        System.out.println("collection = " + collection);

        //在删除集合里面一个元素时,默认是根据equals方法去找这个元素,如果这个对象没有覆写equals,
        // 默认是用Object里面的equals方法(==),找不到这个对象,所以一个元素如果放入集合中要删除,必须要重写equals方法
        boolean zhang = collection.remove(new Person("zhang"));

        //判断集合中是否有当前元素
        boolean zhangFlag = collection.contains(new Person("zhang"));

        System.out.println("zhang = " + zhang);
        System.out.println("collection = " + collection);
    }


    public void test1() {
        // 返回只读，不能修改  ，快速生成 list 对象
        Collection collection = Arrays.asList("123", "123", "123");
        // 清空集合所有 元素
        collection.clear();

        //
        //  集合转化为数组
        Object[] obj = collection.toArray();
        System.out.println("Arrays.toString(obj) = " + Arrays.toString(obj));

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();

            // remove 要在 naxt 获取之后 ，删除
            iterator.remove();
            System.out.println("next = " + next);

        }


    }

    @Test
    public void test2() {
        Collection collection = new ArrayList();
        collection.add("123");

    }

    @Test
    public void test3() {
        List list = new ArrayList<>();

        //  List 默认不能装 基本类型数据， 加入会自动装箱
        // 加入了不会报错， 一般 不放基本类型数据
        //     放的轻松， 取的难,
        list.add(1);
        list.add(3.0);
        list.add(5);
        list.add(true);
        list.add('z');

        // 放入类型没有限制，默认转化为 Object 类型
        //  取得时候，不知具体类型，不安全

        Object num1 = list.get(2);
        Object num2 = list.get(3);


        // 删除下标 的值 ，从0开始，不会发生类型转换

        list.remove(1);

        // 修改下标2的元素值  修改元素
        list.set(2, 0.23);

        // 长度 size() 是 一个方法  ,判断 list 是否为空
        list.size();


        // 判断 一个集合是否为空，用 isEmpty()判断，
        // 性能比较高。少用 size()==0判断


    }

    @Test
    public  void testFanxing(){

        ArrayList<Object> list = new ArrayList<>();
//        List<Object> list = new ArrayList<Dog>();
    }


}


class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Person person = (Person) o;

        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}