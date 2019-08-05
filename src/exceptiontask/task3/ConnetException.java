package exceptiontask.task3;

/**
 * @author tjk
 * @date 2019/8/5 20:20
 */
public class ConnetException extends Exception {
    public ConnetException() {
    }

    public ConnetException(String message) {
        super(message);
    }

    public ConnetException(String message, Throwable cause) {
        super(message, cause);
    }
}
