package me.day05.practice;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = ' ';
        String result = "";
        while (true){
            ch = sc.next().charAt(0);
            if (ch == 'q')
                break;
            result += ch;
        }
        System.out.println(result);
    }

}

