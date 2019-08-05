package exceptiontask.task4;

/**
 * @author tjk
 * @date 2019/8/5 20:55
 */
public class Boat {
    private int maxWeight;
    int presentWeight;

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }


    public void loading(int m) throws DangerException{
        presentWeight+=m;
        if (presentWeight>maxWeight) {
            throw new DangerException();

        }
        System.out.println("当前装载货物"+presentWeight+"吨");

    }

}
