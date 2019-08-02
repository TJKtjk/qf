package zuoye.task3;

/**
 * @author tjk
 * @date 2019/8/1 19:18
 */
public abstract class AbstractPisa {

    private String pisaName;
    private int pisaPrice;
    private int pisaSize;

    /**
     * 无参构造
     */
    public AbstractPisa() {
        super();
    }

    public AbstractPisa(String name, int size, int price) {
        super();
        this.pisaSize = size;
        this.pisaPrice = price;
        this.pisaName = name;
    }


    public String getPisaName() {
        return pisaName;
    }

    public void setPisaName(String pisaName) {
        this.pisaName = pisaName;
    }

    public int getPisaPrice() {
        return pisaPrice;
    }

    public void setPisaPrice(int pisaPrice) {
        this.pisaPrice = pisaPrice;
    }

    public int getPisaSize() {
        return pisaSize;
    }

    public void setPisaSize(int pisaSize) {
        this.pisaSize = pisaSize;
    }

    public String show() {
        return "制作披萨";
    }


    @Override
    public String toString() {
        return "Pisa{" +
                "pisaName='" + pisaName + '\'' +
                ", pisaPrice=" + pisaPrice +
                ", pisaSize=" + pisaSize +
                '}';
    }
}

