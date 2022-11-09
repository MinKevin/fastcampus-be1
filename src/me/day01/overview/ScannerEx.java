package me.day01.overview;


import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //enter(개행문자 '\n or %n'을 기준으로 input에 저장)
        String input = scanner.nextLine();

        //문자열 input을 int형으로 변환
        int num = Integer.parseInt(input);

    }
}
