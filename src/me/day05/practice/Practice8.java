package me.day05.practice;

public class Practice8 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i++);
        }

        int k = 1;
        while (k <= 5) {
            int l = 1;
            while (l <= 5) {
                l++;
                System.out.print("*");
            }
            System.out.println();
            k++;
        }
    }
}
