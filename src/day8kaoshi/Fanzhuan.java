package day8kaoshi;

/**
 * @author tjk
 * @date 2019/8/9 16:11
 */
public class Fanzhuan {

    public void change(String str){
        char []ch=str.toCharArray();
        // 切割字符串
        String[] arr = str.split(" ");

        for (int i = 0; i <ch.length; i++) {
            if (ch[i]<=91){
                char c=(char) (ch[i]+32);
                System.out.println(c);
            }
        }

    }

    public static void main(String[] args) {
        Fanzhuan f=new Fanzhuan();
        f.change("aFDSsfs");
    }





}
