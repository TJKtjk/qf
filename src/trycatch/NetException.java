package trycatch;

import org.junit.Test;

/**
 * net 异常
 * @author tjk
 * @date 2019/8/5 17:25
 */
public class NetException  extends Exception{
    public NetException() {
    }

    public NetException(String message) {
        super(message);
    }

    public NetException(String message, Throwable cause) {
        super(message, cause);
    }

    // 异常链

}
