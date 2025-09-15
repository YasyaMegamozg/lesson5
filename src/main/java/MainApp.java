import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
//        stringAdd(7,"hello World");
        int[] arr = {1, 6, 3, 8, 9, 2, 4, 7};
        printArr(arr);

    }

    //    public static void stringAdd(int a, String b) {
//        for (int i = 0; i < a; i++) {
//            System.out.println(b);
//        }
//    }
    public static void printArr(int[] arr) {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>5) {
                sum+=arr[i];
            }
        }
        System.out.println("сумма элементов: " + sum);
    }


}
