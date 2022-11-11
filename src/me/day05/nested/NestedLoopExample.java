package me.day05.nested;

public class NestedLoopExample {
    public static void main(String[] args) {
        // 구구단 출력 (2단 ~ 9단)
        for (int i = 2; i < 10; i++) { // 2, 3, 4
            for (int j = 1; j < 10; j++) { // 1 ~ 9, 1 ~ 9, 1 ~ 9
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
            System.out.println();
        }
        System.out.println("==========================\n");

        // 구구단 출력 (2단 ~ 9단)
        int i = 2;
        while (i < 10) {
            int j = 1;
            while (j < 10) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println("==========================\n");

        ///////////////////////////////////////////////////////////////////

//      (1, 1), (2, 2), (3, 3) .... (9, 9)
        for (int k = 1; k < 10; k++) {
            for (int l = 1; l < 10; l++) {
                if (k == l) {
                    System.out.printf("(%d, %d)\n", k, l);
                }
            }
        }
        System.out.println("\n==========================\n");


        int k = 1;
        for (int l = 1; l < 10; l++) {
            System.out.printf("(%d, %d)\n", k, l);
            k++;
        }
        System.out.println("\n==========================\n");


        ///////////////////////////////////////////////////////////////////
        // Nested Loop Beak
        // (1)
        for (int x = 2; x < 10; x++) { // 2, 3, 4
            for (int y = 1; y < 10; y++) { // 1 ~ 9, 1 ~ 9, 1 ~ 9
                if (y % 3 == 0) break; // 내부 반복문만 종료
                System.out.printf("%d x %d = %d\n", x, y, x * y);
            }
            System.out.println();
        }
        System.out.println("==========================\n");

        // (2)
        boolean checker = false;
        for (int x = 2; x < 10; x++) { // 2, 3, 4
            for (int y = 1; y < 10; y++) { // 1 ~ 9, 1 ~ 9, 1 ~ 9
                if (y % 3 == 0) {
                    checker = true;
                    break; // 내부 반복문만 종료
                }
                System.out.printf("%d x %d = %d\n", x, y, x * y);
            }
            if (checker) break;
            System.out.println();
        }
        System.out.println("\n==========================\n");

        // (3)
        for (int x = 2; x < 10; x++) { // 2, 3, 4
            for (int y = 1; y < 10; y++) { // 1 ~ 9, 1 ~ 9, 1 ~ 9
                if (y % 3 == 0) return; // 외부 반복문 종료
                System.out.printf("%d x %d = %d\n", x, y, x * y);
            }
            System.out.println();
        }
        System.out.println("\n==========================\n");

    }
}
