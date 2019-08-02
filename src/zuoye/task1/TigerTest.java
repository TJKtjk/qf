package zuoye.task1;

/**
 * @author tjk
 * @date 2019/8/1 19:01
 */
public class TigerTest {
    public static void main(String[] args) {

        AbstractTiger abstractTiger;

        abstractTiger=new TigerOfDongBei();
        abstractTiger.run();

        abstractTiger=new TigerOfHuaNan();
        abstractTiger.run();


    }
}
