package utils;

import java.util.Scanner;

public class Hello {
    /*public static void main(String[] args) {
        int[] arr = getIntegers(5);
        sortArray(arr);
        printArray(arr);
    }*/

    private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int number){
        System.out.println("Enter your "+ number + " numbers");
        int[] array = new int[number];

        for (var i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printArray(int[] arr){
        for (var i = 0; i < arr.length; i++){
            System.out.println("Element " + i + " contents "+ arr[i]);
        }
    }

    public static void sortArray(int[] arr){
        int n = arr.length - 1;

        for (int i = 0; i <= n - 1; i++){
            for (int j = i + 1; j <= n; j++){
                if(arr[i] < arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
