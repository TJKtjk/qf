package day8kaoshi;

/**
 * @author tjk
 * @date 2019/8/9 16:40
 */
public class StringTest {

    public static void main(String[] args) {
        StringTest st = new StringTest();
        boolean b = st.isSymmetry("abcdba");
        System.out.println("b = " + b);
    }

    public boolean isSymmetry(String s) {
        if (s == null) {
            return false;
        }
        if (s.equals("") || s.length() == 1) {
            return true;
        }
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}



