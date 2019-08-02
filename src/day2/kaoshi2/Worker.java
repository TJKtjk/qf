package day2.kaoshi2;

/**
 * 5.
 * 创建一个工人类Worker
 *  1）工人类的属性：工龄、工号、姓名、基本工资  Phone phone
 *             需要定义一个Phone类，属性：brand  price
 *  2）输出所有信息的方法（包含手机的信息）
 *  3）定义一个输出工资的方法（工资=基本工资）
 *     4）创建一个部门经理类，继承工人Worker类，并重写其计算工资的方法（工资=基本工资+岗位级别*500+工龄*1000）
 *                  添加属性Saler saler;   定义一个方法manager(){打印部门经理谁负责管理的是哪个销售人员，当月的销售金额是XX} 表示管理哪个销售人员
 *  5）创建一个销售人员类，继承工人Worker类，
 *   并增加一个属性（销售金额）。
 *   并重写其计算工资的方法
 *   （工资=基本工资+销售金额*系数（其中系数当销售金额大于100W时为0.09，小于100W时为0.08））
 *  6）创建测试类，分别定义Manager类的对象，并赋值，调用其输出工资的方法和manager方法进行测试。
 */

/**
 * @author tjk
 * @date 2019/8/2 17:18
 */
public class Worker {

    // 工人类的属性：工龄、工号、姓名、基本工资  Phone phone
    private int workAge;
    private String workID;
    private String name;
    private int salary;
    private  Phone phone;

    @Override
    public String toString() {
        return "Worker{" +
                "workAge=" + workAge +
                ", workID='" + workID + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", phone=" + phone +
                '}';

    }
     public void printSalary(){
         System.out.println("工资："+this.getSalary());
     }



    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    public String getWorkID() {
        return workID;
    }

    public void setWorkID(String workID) {
        this.workID = workID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
