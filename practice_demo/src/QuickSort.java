import java.util.Arrays;

/**
 * 快速排序
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] a = {3, 1, 2};
        System.out.println(Arrays.toString(quickSort(a, 0, a.length - 1)));
    }


    public static int[] quickSort(int[] arr, int start, int end) {
        int i = start;
        int j = end;
        int baseVal = arr[start];

        while (i < j) {
            while (i < j && arr[j] <= baseVal) {
                j--;
            }
            if (arr[j] > baseVal) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            while (i < j && arr[i] >= baseVal) {
                i++;
            }
            if (arr[i] < baseVal) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }

            if (i > start) {
                quickSort(arr, start, i - 1);
            }
            if (j < end) {
                quickSort(arr, j + 1, end);
            }
        }
        return arr;
    }
    //快速排序
    /*public static int[] quickSort(int[] arr, int start, int end) {
        //定义从左查找索引
        int i = start;
        //定义从右查找索引
        int j = end;
        //定义基准数，一般为数组第一个元素
        int baseVal = arr[start];
        //循环排序
        while (i < j) {
            //从右边开始查找比基准数小的值
            while (i < j && arr[j] >= baseVal) {
                j--;
            }
            //找到这个值与左边i位置元素交换
            if (arr[j] < baseVal) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            //从左边开始查找比基准数大的值
            while (i < j && arr[i] <= baseVal) {
                i++;
            }
            //找到这个值与左边j位置的元素交换
            if (arr[i] > baseVal) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            //此时的i如果大于起始所以
            if (i > start) {
                quickSort(arr, start, i - 1);
            }
            if (j < end) {
                quickSort(arr, j + 1, end);
            }
        }


        return arr;
    }*/

}

