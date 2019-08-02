package day2.kaoshi2;

/**
 * @author tjk
 * @date 2019/8/2 17:55
 */
public class Student {
    //1）属性：姓名,班级，考试成绩，平时成绩，总成绩。
    // 2）普通方法：自我介绍的方法
    // 3）构造方法：两个参数的构造方法，通过构造方法为姓名与班级赋初始值。

    private String name;
    private String banji;

    private double testGrade;
    private double nomalGrade;
    private double sumGrade;

    public Student(String name,String banji){
        this.banji=banji;
        this.name=name;

    }

    public void introduce(){
        System.out.println("自我介绍");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBanji() {
        return banji;
    }

    public void setBanji(String banji) {
        this.banji = banji;
    }

    public double getTestGrade() {
        return testGrade;
    }

    public void setTestGrade(double testGrade) {
        this.testGrade = testGrade;
    }

    public double getNomalGrade() {
        return nomalGrade;
    }

    public void setNomalGrade(double nomalGrade) {
        this.nomalGrade = nomalGrade;
    }

    public double getSumGrade() {
        return sumGrade;
    }

    public void setSumGrade(double sumGrade) {
        this.sumGrade = sumGrade;
    }
}
