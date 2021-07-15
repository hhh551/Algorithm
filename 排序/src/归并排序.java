import java.util.Arrays;

/**
 * @Author:Tsx
 * @Date:2021-07-15- 9:53
 */
public class 归并排序 {

    public int[] mergeSort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        return merge(mergeSort(left), mergeSort(right));
    }

    public int[] merge(int[] left, int[] right) {
        //创建一个新数组，长度为两个有序数组的长度之和
        int[] newArray = new int[left.length + right.length];

        //定义两个指针，分别代表两个数组的下标
        int lindex = 0;
        int rindex = 0;
        for (int i = 0; i < newArray.length; i++) {
            //左边数组已经排好序
            if (lindex >= left.length) {
                newArray[i] = right[rindex++];
                //右边数组已经排好序
            } else if (rindex >= right.length) {
                newArray[i] = right[rindex++];
                //左边数组的元素更小
            } else if (left[lindex] < right[rindex]) {
                newArray[i] = left[lindex++];
                //右边数组的元素更小
            } else {
                newArray[i] = right[rindex++];
            }
        }
        return newArray;
    }
}
