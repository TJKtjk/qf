package zuoye.task3;

/**
 * @author tjk
 * @date 2019/8/1 19:21
 */
public class SeafoodPizza extends AbstractPisa {


    /**
     * 无参构造
     */
    public SeafoodPizza() {

    }

    /**
     * 有参构造
     * @param name
     * @param pisaSize
     * @param price
     */
    public SeafoodPizza(String name,int pisaSize, int price) {
        super(name,pisaSize,price);

    }

    @Override
    public String show() {

        return "你的披萨如下：名称:"+super.getPisaName()+"\n价格:"+super. getPisaPrice()+"元"+"\n大小:"+super.getPisaSize()+"寸";

    }


}
