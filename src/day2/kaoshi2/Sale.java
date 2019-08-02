package day2.kaoshi2;

/**
 * @author tjk
 * @date 2019/8/2 17:40
 */
public class Sale extends Worker {
    private  double saleMoneyNum;

    public double getSaleMoneyNum() {
        return saleMoneyNum;
    }

    public void setSaleMoneyNum(double saleMoneyNum) {
        this.saleMoneyNum = saleMoneyNum;
    }

    @Override
    public void printSalary(){
        if (saleMoneyNum>100){
            double xishu=0.09;
            System.out.println("工资："+this.getSalary()+xishu*saleMoneyNum);

        }
        if (saleMoneyNum<100){
            double xishu=0.08;
            System.out.println("工资："+this.getSalary()+xishu*saleMoneyNum);

        }
    }
}
