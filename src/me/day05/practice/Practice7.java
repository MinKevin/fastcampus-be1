package me.day05.practice;

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("현금을 얼마나 가지고 있니?"); //원까지 입력
        String inpMoney = sc.next();

        int  money = 0;
        if (inpMoney.charAt(inpMoney.length() - 1) == '원')
            money = Integer.parseInt(inpMoney.substring(0, inpMoney.length() - 1));
        else
            money = Integer.parseInt(inpMoney);

        if (money < 2500){
            System.out.println("돈이 부족하여 김밥천국 입장 불가능\n");
            return;
        }

        while (true) {
            System.out.println(
                    "\n" +
                    "1. 김밥 - 2500\n" +
                            "2. 라면 - 3000\n" +
                            "3. 떡볶이 - 4000\n" +
                            "4. 돈까스 - 5000\n" +
                            "5. 종료\n"
            );
            System.out.printf("입력 : ");
            int inp = sc.nextInt();
            if (inp == 5){
                System.out.println("프로그램 종료");
                System.out.println("지금까지 선택하신 식사 주문이 완료되었습니다.");
                break;
            }
            if (inp < 0 || inp >5){
                System.out.println("1~5번 사이의 메뉴를 선택해주세요\n");
                continue;
            }
            System.out.printf("메뉴 주문 번호 : %d\n", inp);

            int price = 0;
            switch(inp){
                case 1:
                    price = 2500;
                    break;
                case 2:
                    price = 3000;
                    break;
                case 3:
                    price = 4000;
                    break;
                case 4:
                    price = 5000;
                    break;
            }
            if (money < price){
                System.out.println("돈이 부족하여 메뉴를 선택할 수 없습니다.");
                continue;
            }
            money -= price;
            switch(inp){
                case 1:
                    System.out.print("김밥");
                    break;
                case 2:
                    System.out.print("라면");
                    break;
                case 3:
                    System.out.print("떡볶이");
                    break;
                case 4:
                    System.out.printf("돈까스");
                    break;
            }
            System.out.println("을(를) 선택하셨습니다.");
            System.out.printf("잔돈은 %d원 입니다.\n", money);

            if (money < 2500){
                System.out.println("더 이상 선택할 수 없습니다. 프로그램 종료");
                System.out.println("지금까지 선택하신 식사 주문이 완료되었습니다.");
                break;
            }
        }
    }
}
