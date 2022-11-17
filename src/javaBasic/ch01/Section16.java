package javaBasic.ch01;

public class Section16 {
    public static void main(String[] args) {
        String medal = "Gold";

        switch (medal) {
            case "Gold":
                System.out.println("금메달!");
                break;
            case "Silver":
                System.out.println("은메달!");
                break;
            case "Bronze":
                System.out.println("동메달!");
                break;
            default:
                System.out.println("미상!");
                break;
        }

        //java 14부터 지원되는 Switch Expression
        int month = 3;

        int day = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                System.out.println("한달은 31일!");
                yield 31;
            }
            case 4, 6, 9, 11 -> {
                System.out.println("한 달은 30일입니다.");
                yield 30;
            }
            case 2 ->{
                System.out.println("한 달은 28일 입니다.");
                yield 28;
            }
            default -> {
                System.out.println("존재하지 않는 달입니다.");
                yield 0;
            }
        };
    }
}
