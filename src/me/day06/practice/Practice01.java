package me.day06.practice;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //char chars[] = new char[100];

        String str = sc.nextLine();
        str = str.toUpperCase();

        //System.out.println((int)'a');//97
        //System.out.println((int)'A');//65
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++){
            if (i == 0 && chars[0] >= 65 && chars[0] <= 90)
                chars[0] += 32;

            else if (chars[i - 1] == ' ' && chars[i] >= 65 && chars[i] <= 90)
                chars[i] += 32;
        }

        for (int i = 0; i < str.length(); i++)
            System.out.print(chars[i]);
    }
}
