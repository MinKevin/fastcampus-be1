package javaBasic.ch02;

public class Section15 {
    public static class Taxi{
        String company;
        int money;

        Taxi(String company){
            this.company = company;
        }

        public void pay(int fee){
            money += fee;
        }

        public void showInfo(){
            System.out.println(company + " 소속 택시의 수입은 " + money + "입니다.");
        }
    }

    public static class StudentByTaxi extends Section14.Student{

        StudentByTaxi(String name, int money) {
            super(name, money);
        }

        public void takeTaxi(Taxi taxi, int fee){
            taxi.pay(fee);
            this.money -= fee;
        }
    }

    public static void main(String[] args) {
        StudentByTaxi edward = new StudentByTaxi("Edward", 20000);
        Taxi taxi1 = new Taxi("잘 나간다 운수");
        edward.takeTaxi(taxi1, 10000);
        edward.showInfo();
        taxi1.showInfo();

//        결과
//        Edward님의 남은 돈은 10000원입니다.
//        잘 나간다 운수소속 택시의 수입은 10000입니다.
    }
}
