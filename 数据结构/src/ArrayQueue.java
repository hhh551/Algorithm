/**
 * @Author:Tsx
 * @Date:2021-07-09- 18:54
 * 用数组实现队列
 */
public class ArrayQueue {
    // items为数组，n为数组大小
    private String[] items;
    private int n = 0;
    private int head = 0;
    private int tail = 0;

    public ArrayQueue(int capacity) {
        items = new String[capacity];
        n = capacity;
    }

    // 不能实现数据搬移的入栈
    public boolean enqueue(String item) {
        //如果tail==n。表示队列已满
        if (tail == 0) {
            return false;
        }
        items[tail] = item;
        ++tail;
        return true;
    }

    // 出栈
    public String dequeue() {
        //如果head == tail；队列为空
        if (head == tail) {
            return null;
        }
        String res = items[head];
        ++head;
        return res;
    }

    // 实现数据搬移的入栈
    public boolean enqueue2(String item) {
        //tail==n ,表示队尾没有空间插入
        if (tail == n) {
            // tail== n && head==0
            if (head == 0) {
                return false;
            }
            for (int i = head; i <= tail; ++i) {
                items[i - head] = items[i];
            }
        }
        //搬移完之后，或者不需搬移时
        items[tail] = item;
        ++tail;
        return true;
    }

}
