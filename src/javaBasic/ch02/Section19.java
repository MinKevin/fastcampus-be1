package javaBasic.ch02;

public class Section19 {
    static class CarFactory{
        private static int serialNumCounter = 1000;

        static CarFactory instance = new CarFactory();

        private CarFactory(){}

        public static CarFactory getInstance(){
            return instance;
        }
        public int getSerialNumCounter(){
            return serialNumCounter;
        }
        public Car createCar(){
            return new Car(++serialNumCounter);
        }
    }

    static class Car{
        private int serialNum;

        public Car(int serialNum){
            this.serialNum = serialNum;
        }

        public int getCarNum(){
            return serialNum;
        }
    }

    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance();
        Car mySonata = factory.createCar();
        Car yourSonata = factory.createCar();

        CarFactory instance1 = factory.instance;
        CarFactory instance2 = factory;
        CarFactory instance3 = factory.instance.instance.instance.instance;

        System.out.println("instance1 = " + instance1);
        System.out.println("instance2 = " + instance2);
        System.out.println("instance3 = " + instance3);


        System.out.println(mySonata.getCarNum());
        System.out.println(yourSonata.getCarNum());

//        결괏값
//        1001
//        1002
    }
}
