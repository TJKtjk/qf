package day1.abstract1;

/**
 * @author tjk
 * @date 2019/7/31 11:34
 */

/**
 * 通过继承把动物共有的属性从父类继承过来,本类不需要写类似代码
 */

  public class Dog extends AbstractAnimal {

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void move() {

        System.out.println("跑");
    }



}
