package SimFactory;

/**
 * 简单工厂 既能生产奔驰，又能生产宝马
 */

/**
 * @author tjk
 * @date 2019/8/3 17:13
 */
public class SimpleFactory {
   public  CarInterface  getCar(String name){
       if (name.equals("Benz")){
           return new Benz();
       }
       if (name.equals("BMW")){
           return new Bmw();
       }
       else {
           System.out.println("对不起，无法生产此品牌汽车");
           return  null;
       }

   }

   // test
    public static void main(String[] args) {
        SimpleFactory simpleFactory=new SimpleFactory();
        CarInterface carInterface=simpleFactory.getCar("BMW");
        System.out.println(carInterface.getName());


    }

}
