package me.day06.function;

public class RecursiveFunctionExample {
    /*
    * 재귀함수 (recursive function): 함수 내에서 자기자신을 호출하는 함수
    * ex) 0 1 1 2 3 5 8 ....
    * */

    public static void main(String[] args) {
        long res1 = fibonacciFor(10);
        long res2 = fibonacciRecursive(10);
        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);

    }

    public static long fibonacciFor(int n) {

        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 2; i <= n; i++) { // 2항 ~ n항
            c = a + b;
            a = b;
            b = c;
        }
        return c; // n항의 값
    }

    public static long fibonacciRecursive(int n) { // divide-and-conquer (분할 정복), 성능 좋지 않음 (중복되는 항의 계산이 많기 때문)

        // f(n) = f(n-1) + f(n-2) (점화식)
        if (n == 0) return 0; // 종료 구문
        if (n == 1) return 1; // 종료 구문
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

}
