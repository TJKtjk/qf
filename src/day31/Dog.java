package day31;


/**
 * 通过继承把动物共有的属性从父类继承过来,本类不需要写类似代码
 */

/**
 * @author tjk
 * @date 2019/7/31 11:34
 */
  public class Dog extends Animal {

    @Override
    public void eat() {
      // 调用父类方法
        super.eat();

        System.out.println("吃骨头");
    }




}
