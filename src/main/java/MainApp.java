import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
//        stringAdd(7,"hello World");
//        int[] arr = {1, 6, 3, 8, 9, 2, 4, 7};
//        printArr(arr);
//        int []arr ={1,3,6,8,};
//        numberAndArr(5, arr);
        int [] arr={1,5,8,2,9};
        addNumbertoArr(8,arr);

    }

    //    public static void stringAdd(int a, String b) {
//        for (int i = 0; i < a; i++) {
//            System.out.println(b);
//        }
//    }

//    public static void printArr(int[] arr) {
//        int sum=0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]>5) {
//                sum+=arr[i];
//            }
//        }
//        System.out.println("сумма элементов: " + sum);
//    }

//    public static void numberAndArr(int n, int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=n;
//        }
//        System.out.println(Arrays.toString(arr));
//    }

    public static void addNumbertoArr(int n, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] +=2;
        }
        System.out.println(Arrays.toString(arr));
    }

}
