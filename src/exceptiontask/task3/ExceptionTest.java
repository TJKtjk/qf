package exceptiontask.task3;

import org.junit.Test;

/**
 * @author tjk
 * @date 2019/8/5 20:18
 */
public class ExceptionTest {

    @Test
    public void test() {
        try {
            checkNet();
        } catch (NetException e) {
            e.printStackTrace();
        }

    }

    private void checkNet() throws NetException {
        try {
            checkdataBase();
        } catch (ConnetException e) {
            throw new NetException("网络异常", e);
        }
    }

    private void checkdataBase() throws ConnetException {
        try {
            checkConnet();
        } catch (DataBaseException e) {
            throw new ConnetException(" 连接异常", e);
        }
    }

    private void checkConnet() throws DataBaseException {
        try {
            checkClass();
        } catch (ClassException e) {
            throw new DataBaseException(" 连接数据库异常", e);
        }
    }

    private void checkClass() throws ClassException {

        throw new ClassException(" 数据库类异常");

    }


}
