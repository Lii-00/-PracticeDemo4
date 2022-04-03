package day1.practice1;
/*
    算法二：排序
            选择排序
            冒泡排序
            插入排序
 */
public class SelectionSort {

    //选择排序
    public static void selectionSort(int[] arr){
        if(arr ==null || arr.length < 2)return;
        int minIndex;
        for(int i = 0 ; i < arr.length ; i++){
            minIndex = i;
            for(int j = i + 1; j < arr.length ; j++){
                minIndex = arr[minIndex] < arr[j] ? minIndex : j;
            }
            swap(arr,i,minIndex);
        }
    }
    //冒泡排序
    public static void bubbleSort(int[] arr){
        if(arr ==null || arr.length < 2)return;
        int N = arr.length;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N-1-i; j++){
                if(arr[j+1] < arr[j]){
                    swap(arr,j,j+1);
                }
            }
        }
    }
    //插入排序
    public static void insertSort(int[] arr){
        if(arr ==null || arr.length < 2)return;
        int N = arr.length;
        int newNumIndex;
        for(int i = 1;i < N; i++){
            newNumIndex = i;
            while(newNumIndex >= 0 && arr[newNumIndex-1] > arr[newNumIndex]){
                swap(arr,newNumIndex,newNumIndex-1);
                newNumIndex--;
            }
        }
    }
    //交换两数位置
    public static void swap(int[] arr,int i,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    //打印数组
    public static void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3,5,7,2,4,1,1,0,4,8,3,0};
        System.out.println("原数组为：");
        print(arr);
        selectionSort(arr);
        System.out.println("数组选择排序后为：");
        print(arr);
        bubbleSort(arr);
        System.out.println("数组冒泡排序后为：");
        print(arr);
        insertSort(arr);
        System.out.println("数组插入排序后为：");
        print(arr);
    }
}
