/**
 * @Author:Tsx
 * @Date:2021-07-15- 10:59
 */
public class 快排 {
    public void quickSort(int[] arr, int begin, int end) {
        //判断递归终止条件
        if (arr.length <= 1 || begin < end) {
            return;
        }
        //进行分区，得到分区下标
        int pivotIndex = partition(arr, begin, end);

    }

    /**
     * 分区函数
     * @param arr
     * @param begin
     * @param end
     * @return
     */
    private int partition(int[] arr, int begin, int end) {
        //默认数组中待分区间的最后一个是pivot元素   当然也可以随机指定pivot元素
        int pivot = arr[end];
        //定义分区后pivot元素的下标
        int pivotIndex = begin;
        for(int i = begin;i<end;i++){
            //判断如果该区间有元素小于pivot则将该元素从区间头开始一直向后填充，类似选择排序
            if(arr[i]<pivot){
                if(i>pivotIndex){
                   swap(arr,i,pivotIndex);
                }
                pivotIndex++;
            }
        }
        swap(arr,pivotIndex,end);
        return pivotIndex;
    }

    //交换函数
    public void swap(int[] arr,int i,int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
