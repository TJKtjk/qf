package day6.task;

/**
 * @author tjk
 * @date 2019/8/6 19:21
 */
public class Person {
    /**
     * 将一个字符串"0001 zhangsan 20 深圳宝安 true" 解析成一个Person对象,
     * 其中分隔符为字符串,字符串内容分别对应的是"id 姓名 年龄 地址 是否在校"
     */
    private int id;
    private String name;
    private int age;
    private String  adress;
    private boolean isOnSchool;

    @Override
    public String toString() {
        return "Person{" +
                "姓名='" + name + '\'' +
                ", 地址='" + adress + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public boolean isOnSchool() {
        return isOnSchool;
    }

    public void setOnSchool(boolean onSchool) {
        isOnSchool = onSchool;
    }
}
