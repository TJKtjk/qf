package exceptiontask.task3;

/**
 * @author tjk
 * @date 2019/8/5 20:23
 */
public class DataBaseException extends Exception {
    public DataBaseException() {
    }

    public DataBaseException(String message) {
        super(message);
    }

    public DataBaseException(String message, Throwable cause) {
        super(message, cause);
    }
}
