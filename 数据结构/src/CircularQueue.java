/**
 * @Author:Tsx
 * @Date:2021-07-09- 19:32
 * 数组实现循环队列
 */
public class CircularQueue {
    private String[] items;
    private int n = 0;
    private int head = 0;
    private int tail = 0;

    public CircularQueue(int Capacity) {
        items = new String[Capacity];
        n = Capacity;
    }

    public boolean enqueue(String item) {
        // 队列满了
        if ((tail + 1) % n == head) {
            return false;
        }
        items[tail] = item;
        //tail位置变化
        tail = (tail + 1) % n;
        return true;
    }

    public String dequeue() {
        // 如果head==tail，表示队列为空
        if (head == tail) {
            return null;
        }
        String res = items[head];
        head = (head + 1) % n;
        return res;
    }
}
