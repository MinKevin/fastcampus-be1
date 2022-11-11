package me.day05.practice;

public class Practice6 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5 - (i + 1); j++){
                System.out.print(" ");
            }
            for (int j = 0; j < (i + 1); j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
