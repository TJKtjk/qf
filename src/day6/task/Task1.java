package day6.task;


/**
 * @author tjk
 * @date 2019/8/6 18:29
 */
public class Task1 {

    /**
     * 判断字符串第一个位置是否是空格，如果是继续向下判断，
     * 直到不是空格为止。结尾处判断空格也是如此。
     * 当开始和结尾都判断到不是空格时，就是要获取的字符串。
     *
     * 从 头 从 尾 找
     */
    //模拟trim()
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = " fef  fefer ";
        String newStr = "";
        int star = 0;
        int end = -1;
        //获取前标
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                star = i;
                break;
            }
        }
        //获取后标
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                end = i;
                break;
            }
        }
        //存入新字符串
        newStr= str.substring(star,end+1);

        System.out.println(str.length());
        System.out.println(newStr);
    }


}
