package cn.fraudmetrix.edu;

/**
 * 排序算法
 * 冒泡排序
 */
public class Sort {
    public static void main(String[] args) {
        Integer arr[] = {2, 5, 4, 6, 9, 1};
        showArr(arr);
        bubbleSort(arr,arr.length);
        showArr(arr);



    }
    public static void bubbleSort (Integer[]arr,int n){
        if (n <= 1) return;
        for (int i = 0; i < n; ++i) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }

            }
            if (!flag) break;//如果已经有序，退出排序
        }
    }
    public static void showArr(Integer arr[]){
        for (int j=0;j<arr.length;j++){
            System.out.print(arr[j]+"\t");
        }
        System.out.println();

    }

}
