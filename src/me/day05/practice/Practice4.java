package me.day05.practice;

public class Practice4 {
    public static void main(String[] args) {
        //int arr[] = new int[5];
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++) {
                System.out.printf("(%d, %d)\n", arr[i], arr[j]);
            }
        }
    }
}
