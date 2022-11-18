package javaBasic.ch02;

public class Section14 {
    static class Student{
        String name;
        int money;

        Student(String name, int money){
            this.name = name;
            this.money = money;
        }

        public void takeBus(Bus bus){
            if (money - bus.getFee() < 0)
                System.out.println("잔액이 부족합니다.");
            else{
                bus.pay();
                money -= bus.getFee();
            }
        }

        public void takeSubway(Subway subway){
            if (money - subway.getFee() < 0)
                System.out.println("잔액이 부족합니다.");
            else{
                subway.pay();
                money -= subway.getFee();
            }
        }

        public void showInfo(){
            System.out.println(name + "님의 남은 돈은 " + money + "원입니다.");
        }
    }

    static class Bus{
        int no;
        int fee;
        int money;
        int passengerCount;

        Bus(int no, int fee){
            this.no = no;
            this.fee = fee;
        }

        public int getFee(){
            return fee;
        }

        public void pay(){
            money += fee;
            passengerCount++;
        }

        public void showInfo(){
            System.out.println(no + "번의 승객은 " + passengerCount + "명이며 수입은 " + money + "입니다.");
        }
    }

    static class Subway{
        int no; int fee; int money; int passengerCount;

        Subway(int no, int fee){
            this.no = no;
            this.fee = fee;
        }

        public int getFee(){
            return fee;
        }

        public void pay(){
            money += fee;
            passengerCount++;
        }
        public void showInfo(){
            System.out.println(no + "번의 승객은 " + passengerCount + "명이며 수입은 " + money + "입니다.");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("A", 10000);
        Student s2 = new Student("B", 1500);
        Bus bus = new Bus(100, 1000);
        Subway subway = new Subway(100, 600);

        s1.takeBus(bus);
        s2.takeBus(bus);

        s1.takeSubway(subway);
        s2.takeSubway(subway);

        s1.showInfo();
        s2.showInfo();
        bus.showInfo();
        subway.showInfo();

//        결과
//        잔액이 부족합니다.
//        A님의 남은 돈은 8400원입니다.
//                B님의 남은 돈은 500원입니다.
//        100번의 승객은 2명이며 수입은 2000입니다.
//        100번의 승객은 1명이며 수입은 600입니다.
    }
}
