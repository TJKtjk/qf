package exceptiontask.task3;

/**
 * @author tjk
 * @date 2019/8/5 20:26
 */
public class NetException  extends Exception{
    public NetException(String message) {
        super(message);
    }

    public NetException(String message, Throwable cause) {
        super(message, cause);
    }

    public NetException() {
    }
}
