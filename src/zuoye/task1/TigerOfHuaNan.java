package zuoye.task1;

/**
 * @author tjk
 * @date 2019/8/1 18:38
 */
public class TigerOfHuaNan extends AbstractTiger {

    private String   name  ;
    private String   color;
    private int  weight;
    private int   age;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("B老虎以100时速跑");

    }

    @Override
    public void eat() {

    }

    @Override
    public void drinkWater() {

    }
}
