package exceptiontask.task3;

/**
 * @author tjk
 * @date 2019/8/5 20:18
 */
public class ClassException extends Exception{
    public ClassException() {
    }

    public ClassException(String message) {
        super(message);
    }

    public ClassException(String message, Throwable cause) {
        super(message, cause);
    }
}
