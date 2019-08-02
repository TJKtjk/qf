package zuoye.task1;

/**
 * @author tjk
 * @date 2019/8/1 18:40
 */
public class TigerOfDongBei extends AbstractTiger {

    private String  [] name  ;
    private String  []color;
    private int [] weight;
    private int [] age;

    @Override
    public void eat() {

    }

    @Override
    public void drinkWater() {

    }


    public void setWeight(int []weight) {
        int wei=1000;
        for (int i = 0; i < weight.length; i++) {
            if(weight[i]>wei) {
                System.out.println("没有这么大的老虎");
                return ;
            }
            if(weight[i]<0) {
                return ;
            }
        }
        this.weight = weight;
    }

    public String[] getColor() {
        return color;
    }
    public void setColor(String[] color) {
        this.color = color;
    }
    public int[] getAge() {
        return age;
    }
    public void setAge(int[] age) {
        this.age = age;
    }
    public int[] getWeight() {
        return weight;
    }
    public String [] getName() {
        return name;
    }
    public void setName(String [] name) {
        this.name = name;
    }





    @Override
    public void run() {
        System.out.println("A老虎以60时速跑");
    }
}
