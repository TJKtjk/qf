package day2.kaoshi2;

/**
 * @author tjk
 * @date 2019/8/2 17:27
 */
public class Manager extends Worker {
    int jibie=2;
    private int workAge;

    @Override
    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    @Override
    public void printSalary(){
        System.out.println("工资："+this.getSalary()+jibie*500+getWorkAge()*1000);
    }
}
