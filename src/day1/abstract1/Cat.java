package day1.abstract1;

/**
 * @author tjk
 * @date 2019/7/31 11:27
 */

/**
 * 通过继承把动物共有的属性从父类继承过来,本类不需要写类似代码
 */
public class Cat extends AbstractAnimal {

@Override
public void  eat(){
    System.out.println("猫吃鱼");
}

    @Override
    public void move() {

    }
}
