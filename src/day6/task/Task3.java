package day6.task;

/**
 * @author tjk
 * @date 2019/8/6 19:20
 *
 *  覆写 equals 对象 比较
 */
public class Task3 {

    public static void main(String[] args) {
        String st="0001 zhangsan 20 深圳宝安 true";

        Person person=new Person();
        String[] str =  st.split( " " );


        person.setId(Integer.parseInt(str[0])) ;
        person.setName(str[1]);
        person.setAge(Integer.parseInt(str[2]));
        person.setAdress(str[3]);
        person.setOnSchool(Boolean.parseBoolean(str[4]));

        System.out.println(person);

        Person2 person2=new Person2();
        person2.setAge(20);
        person2.setName("zhangsan");

        boolean p1=person.getName().equals(person2.getName());
        boolean p2=person.getAge()==(person2.getAge());

        if ( p1 && p2 ){
            System.out.println("Person 与 Person2 是同一个人");
        }


    }


}
