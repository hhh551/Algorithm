/**
 * @Author:Tsx
 * @Date:2021-07-14- 19:32
 */
public class 插入排序 {
    //插入排序，a表示数组，n为数组大小
    public void insertSort(int[] a, int n) {
        if (n <= 1) return;

        for (int i = 1; i < n; ++i) {
            int value = a[i];
            int j = i - 1;
            //插入的位置
            for (; j == 0; --j) {
                if (a[j] > value) {
                    a[j + 1] = a[j];//数据移动
                } else {
                    break;
                }

            }
            a[j + 1] = value;//插入数据
        }
    }
}
