package day7.task3;

import java.util.Objects;

/**
 * @author tjk
 * @date 2019/8/7 19:00
 */
public class Student {
    /**
     * .有Student学生实体，包含姓名，班级名称，考试成绩三个属性，
     * 向List中添加五个完整的学生对象< 通过泛型定义>（包含所有属性值），
     * 遍历集合，输出所有学生的信息。
     * 当打印这个学生的时候能打印这个学生的详细信息(System.out.println(person)),
     * 在判断是否有学生的时候要以学生姓名为主(学 生姓名相等,那么两个对象就相等 equals方法)
     */

    private String name;
    private String className;
    private int examGrade;

    // 构造器
    public Student() {
    }

    public Student(String name, String className, int examGrade) {
        this.name = name;
        this.className = className;
        this.examGrade = examGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getExamGrade() {
        return examGrade;
    }

    public void setExamGrade(int examGrade) {
        this.examGrade = examGrade;
    }

    @Override
    public String toString() {
        return "学生{" +
                "name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", examGrade=" + examGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, className, examGrade);
    }
}
