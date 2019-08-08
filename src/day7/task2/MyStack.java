package day7.task2;

/**
 * @author tjk
 * @date 2019/8/7 18:30
 */
public class MyStack {
    /**
     * 完成一个栈或者队列;
     * 要求如下: 底层用数组实现 至少有三个方法 加入 获取 大小 123
     */

    private int[] arr = {};

    //栈顶
    private int top;


    //无参构造方法，
    public MyStack() {
        arr = new int[20];
        top = -1;
    }
     //new 一个类时 初始化数组大小20
    public MyStack(int maxsize) {
        arr = new int[maxsize];
        top = -1;
    }

    //压栈
    public void push(int value) {
        arr[++top] = value;
    }

    //出栈
    public int pop() {
        return arr[top--];
    }


    public int length(){
        return top+1;
    }

    //查看当前
    public int peek() {
        return arr[top];
    }

    //判断是否为空
    public boolean isEmpty() {
        return top == -1;
    }

    //判断是否满了
    public boolean isFull() {
        return top == arr.length - 1;
    }


    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        // 入栈,先判断
        if (myStack.isFull()) {
            System.out.println("栈满了 ");
            return;
        } else {
            myStack.push(30);
            myStack.push(10);
            myStack.push(1);
            myStack.push(12);
        }


        System.out.println("当前栈大小："+myStack.length());

        System.out.println(" 当前栈顶:myStack.peek() = " + myStack.peek());

        // 出栈,先判断
        for (int i = 0; i < 100; i++) {


            if (myStack.isEmpty()) {
                System.out.println("栈为空，无法出栈");
                return;
            } else {

                System.out.println("myStack.pop() = " + myStack.pop());
            }

        }



    }

}
