package day0820.task1;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author tjk
 * @date 2019/8/20 10:37
 */
public class ClassLoaderTest {
    @Test
    public void test() throws IOException {

        Dog dog = new Dog();
        ClassLoader classLoader = dog.getClass().getClassLoader();
        System.out.println("classLoader = " + classLoader);


        //父类加载器
        ClassLoader parent = classLoader.getParent();
        System.out.println("parent = " + parent);


        // 扩展加载器的父类是 启动加载器BOOt,获取不到，JVM
        ClassLoader parent1 = parent.getParent();
        System.out.println("parent1 = " + parent1);


        //
        // 找class源文件配置文件，放src文件夹下

        InputStream resourceAsStream = classLoader.getResourceAsStream("");
        System.out.println("resourceAsStream = " + resourceAsStream);

        Properties properties = new Properties();
        properties.load(resourceAsStream);

        String name = properties.getProperty("name");
        System.out.println("name = " + name);

        resourceAsStream.close();


    }

    @Test
    public void test1() throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        //  项目用的最多
        Class<?> aClass = Class.forName("day0820.task1.Dog");
        System.out.println("aClass = " + aClass);

        // 默认 用 newInstance
        Object o = aClass.newInstance();
        System.out.println("o = " + o);



        // 打印类名 ，得到类名
        String simpleName = aClass.getSimpleName();
        System.out.println("simpleName = " + simpleName);


    }


}
