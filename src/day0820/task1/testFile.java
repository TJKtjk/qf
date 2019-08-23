package day0820.task1;

import org.junit.Test;

import java.lang.reflect.*;

/**
 * @author tjk
 * @date 2019/8/20 14:27
 */
public class testFile {


    @Test
    public void test() throws Exception {

        // 方式一： 声明 Class ,   = 类名.class
        Class dogClass = JinDog.class;

        // 不能New JinDog,获取JinDog的对象 用 newInstance()
        Object o = dogClass.newInstance();

        JinDog jinDog = (JinDog) dogClass.newInstance();
        System.out.println("jinDog = " + jinDog);
        System.out.println("o = " + o);


        //getField() 只能访问公开字段
        Field name = dogClass.getField("address");
        System.out.println("name = " + name);

        System.out.println("===========================");

        // getFields() 得到 当前类和父类的所有公开字段
        Field[] fields = dogClass.getFields();
        for (Field file : fields) {
            System.out.println("fields= " + file);
        }

        System.out.println("===========================");

        // 获取当前类的所有字段
        Field[] declaredFields = dogClass.getDeclaredFields();
        for (Field file : declaredFields) {
            System.out.println("declaredFields=" + file);
        }

        System.out.println("===========================");


        // 根据字段名 获取 当前类的字段，可以使公开、非公开的字段
        Field password = dogClass.getDeclaredField("password");
        System.out.println("password = " + password);

        // 获取 字段password 的类型
        Class<?> type = password.getType();
        System.out.println("type = " + type);

        // 获取 字段password 的 修饰符，默认是 数值，需要Modifier.toString（） 转化
        System.out.println("password.getModifiers() = " + Modifier.toString(password.getModifiers()));


        //通过 setAccessible，可以直接访问一个类的私有字段、方法、构造器
        //  password 原本是私有的
        password.setAccessible(true);
        JinDog jinDog1 = new JinDog();
        // set/get 方法需要传入对象
        password.get(jinDog1);


        System.out.println("===========================");

        // 获取  JinDog 当前类 的所有构造器
        Constructor[] constructors = dogClass.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("constructor = " + constructor);
        }

        System.out.println("===========================");
        System.out.println("===========================");


        // 获取JinDog 的 父类
        Class superclass = dogClass.getSuperclass();
        System.out.println("superclass = " + superclass);

        System.out.println("===========================");


        // 获取 JinDog 的 接口
        Class[] interfaces = dogClass.getInterfaces();
        System.out.println("interfaces = " + interfaces);

        System.out.println("===========================");

        // 获取 JinDog的 包名
        Package aPackage = dogClass.getPackage();
        System.out.println("aPackage = " + aPackage);

        System.out.println("===========================");
        System.out.println("===========================");


        // 获取  JinDog 的 所有公开的public方法,包括继承父类的方法，只能是公开的方法
        Method[] methods = dogClass.getMethods();
        for (Method method : methods) {
            System.out.println("method = " + method);
        }

        // 获取  JinDog 中指定 公开的public方法
        Method drawMoney = dogClass.getMethod("drawMoney", int.class);
        System.out.println("drawMoney = " + drawMoney);


        //  获取  JinDog 中的指定方法,  无视修饰符，（与方法修饰符无关）
        Method drawMoney1 = dogClass.getDeclaredMethod("drawMoney", int.class);

        //  获取  JinDog 中的   所有方法,  无视修饰符，（与方法修饰符无关）
        Method[] declaredMethods = dogClass.getDeclaredMethods();


        System.out.println("===========================");
        System.out.println("===========================");


        // 获取  JinDog 中的方法的异常
        Class<?>[] exceptionTypes = drawMoney.getExceptionTypes();
        System.out.println("exceptionTypes = " + exceptionTypes);

        // 获取  JinDog 中的方法的参数
        Parameter[] parameters = drawMoney.getParameters();
        System.out.println("parameters = " + parameters);

        // 获取  JinDog 中的方法的参数类型
        Class<?>[] parameterTypes = drawMoney.getParameterTypes();
        System.out.println("parameterTypes = " + parameterTypes);



        // invoke 调用反射里面的方法。 第一参数：JinDog ,也就是 对象，第二 ：可变参数，1~多个
        //  即JinDog 的  drawMoney（） 方法
        drawMoney.invoke(jinDog1, 1000);


    }


}
