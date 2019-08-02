package day31;

/**
 * @author tjk
 * @date 2019/7/31 11:34
 */
public abstract class Animal {

    protected String name;
    private int age;
    private String color;

    public String sex;


    public Animal() {

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat() {
        System.out.println("吃饱了");

    }

}