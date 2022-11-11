package me.day05.whiles;

public class WhileExample {
    public static void main(String[] args) {
        // 반복문 (횟수)
        // 1. 초기값
        // 2. 조건문
        // 3. 증감문

        // i = 0 "hello"
        // i = 1 "hello"
        // i = 2 "hello"
        // i = 3 "hello"
        // i = 4 "hello"
        // i = 5 출력안됨 반복문 종료

        // i = 5 -- 1

        int i = 0; // 초기값 (iteration == 반복)
        while(i < 5) { // 조건문
            System.out.println("hello");
            i++; // 증감문
        }
        // 반복문 종료
        System.out.println("i = " + i); // 5
        System.out.println();

        i = 1; // 초기값
        while(i <= 5) { // 조건문
            System.out.println("hello");
            i++; // 증감문
        }
        // 반복문 종료
        System.out.println("i = " + i); // 6
        System.out.println();

        i = 5; // 초기값
        while(i > 0) { // 조건문
            System.out.println("hello");
            i--; // 증감문
        }
        // 반복문 종료
        System.out.println("i = " + i); // 0
        System.out.println();

        //////////////////////////////////////////////////

        int sum = 0;

        i = 1; // 초기화
        while (i <= 10) { // 조건식
            sum += i;
            i ++; // 증감문
        }
        System.out.println("sum = " + sum); // 55

        sum = 0;
        i = 1; // 초기화
        while (i <= 10) { // 조건식
            i ++; // 증감문
            sum += i; // sum = 0 + 2 + 3 + ...... + 10 + 11
        }
        System.out.println("sum = " + sum); // 65

        //////////////////////////////////////////////////

        i = 1;
        while (i <= 10) {
            System.out.println("hello"); // 10
            i++;
        }

        i = 1;
        while (i <= 10) {
            i++;
            System.out.println("hello"); // 10
        }

        // sum = 0
        // sum = 0 + 1
        // sum = 0 + 1 + 2 .... + 10
        //
        // 반복문 종료 후
        // i == 11
    }
}
