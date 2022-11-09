package me.day03.casting;

import java.util.Scanner;

public class Practice {
    static Scanner sc = new Scanner(System.in);
    public static void Practice1(){
        int price;
        int giveMoney;

        System.out.println("노트북의 가격과 지불 금액을 차례대로 입력해주세요.");
        price = sc.nextInt();
        giveMoney = sc.nextInt();

        System.out.printf("잔돈은 %d 원입니다'\n", giveMoney - (price * 1.1));
    }

    public static void Practice2(){
        int num1, num2;
        System.out.println("최대값과 최소값을 입력해주세요.");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.printf("최대값 %d 최소값 %d'\n", num1 > num2 ? num1 : num2, num1 > num2 ? num2 : num1);
    }

    public static void Practice3(){
        int year;
        System.out.println("연도를 입력해주세요.");
        year = sc.nextInt();

        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0)
            System.out.println("윤년");
        else
            System.out.println("평년");
    }
    public static void Practice4(){
        int num1 = 123456780;
        int num2 = 123456780;

        float num3 = num2;
        num2 = (int) num3;
        System.out.println(num3);
        System.out.println(num2);

        int result = num1 - num2;
        System.out.println(result);
    }

    public static void Practice5(){

    }
    public static void main(String[] args) {
        Practice4();

        Practice1();
        Practice2();
        Practice3();
        Practice4();
        //Practice4가 0이 아닌 이유
        //float의 경우 부동소수점 방식으로 저장하게되고, 정확도를 넘어서는 자리수의 경우 오차가 발생할 수도있다.
    }
}


