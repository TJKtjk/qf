package day1.abstract1;

/**
 *  Animal  Dog Cat
 */


/**
 * @author tjk
 * @date 2019/7/31 11:34
 */
public abstract class AbstractAnimal {

    protected String name;
    private int age;
    private String color;

    /**
     * 抽象方法
     */
    public  abstract void eat();

    /**
     * 抽象 moove
     */
    public abstract void move()  ;


    /**
     * 抽象类中的普通方法 调用自己的 抽象方法
     * private public 修饰的都可以
     */
    private void diaoyong(){
        eat();
        move();
    }




    public AbstractAnimal() {

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



}