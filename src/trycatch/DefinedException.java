package trycatch;

/**
 * 自定义异常
 * @author tjk
 * @date 2019/8/5 16:42
 */
public class DefinedException extends Exception {

    // 构造器
    public DefinedException() {
    }

    // 构造器
    public DefinedException(String message) {
        super(message);
    }


    private void addUser(int value) throws DefinedException {

        if (value > 30) {
            throw new DefinedException("你给的值太大了,这边不能接收");
        }

    }



    public static void main(String[] args) throws DefinedException {
        DefinedException definedException=new DefinedException();
        definedException.addUser(50);
    }

}
