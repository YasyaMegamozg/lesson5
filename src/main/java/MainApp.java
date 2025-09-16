import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        stringAdd(7, "hello World");

        int[] arr = {1, 6, 3, 8, 9, 2, 4, 7};
        printArr(arr);

        int[] arr1 = {1, 3, 6, 8,};
        numberAndArr(5, arr);

        int[] arr2 = {1, 5, 8, 2, 9};
        addNumbertoArr(8, arr2);
        
        sumHalv(7, 5, 4, 5, 9, 4, 1, 5);

    }

    public static void stringAdd(int a, String b) {
        for (int i = 0; i < a; i++) {
            System.out.println(b);
        }
    }

    public static void printArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }
        }
        System.out.println("сумма элементов: " + sum);
    }

    public static void numberAndArr(int n, int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = n;
        }
        System.out.println(Arrays.toString(arr1));
    }

    public static void addNumbertoArr(int n, int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] += 2;
        }
        System.out.println(Arrays.toString(arr2));
    }

    public static void sumHalv(int... arr3) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr3.length / 2; i++) {
            sum1 += arr3[i];
        }
        for (int i = arr3.length / 2; i < arr3.length; i++) {
            sum2 += arr3[i];
        }
        if (sum1 > sum2) {
            System.out.println("Первая половина больше: " + sum1 + " > " + sum2);
        } else if (sum2 > sum1) {
            System.out.println("Вторая половина больше: " + sum2 + " > " + sum1);
        } else {
            System.out.println("Суммы равны: " + sum1 + " = " + sum2);
        }
        System.out.println(Arrays.toString(arr3));
    }

}
