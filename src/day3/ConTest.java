package day3;

/**
 * @author tjk
 * @date 2019/8/3 15:29
 */
public class ConTest {
    public static void main(String[] args) {

        Chorus<Singer,YueQi> chorus=new Chorus<Singer,YueQi>();

        Singer singer=new Singer();
        YueQi yueQi=new YueQi();
        chorus.makeChorus(singer,yueQi);


    }
}
