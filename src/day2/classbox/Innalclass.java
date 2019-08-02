package day2.classbox;

/**
 * @author tjk
 * @date 2019/8/2 10:05
 */
public class Innalclass {
    {


    }
    static {

    }




    class Innal{

    }
    static class Innal3{

    }


    public static void main(String[] args) {

        // 外部类  变量 =new 外部类();
        Innalclass innalclass=new Innalclass();

        // 外部类.内部类  变量1 =外部类. new 内部类
        Innalclass.Innal innal=innalclass .new Innal();


    }
}
