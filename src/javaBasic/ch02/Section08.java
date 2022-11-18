package javaBasic.ch02;

import java.util.Date;

public class Section08 {
    public static class Info{
        int tall;
        int weight;

        public Info(int tall, int weight){
            this.tall = tall;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Info{" +
                    "tall=" + tall +
                    ", weight=" + weight +
                    '}';
        }
    }

    public static class Client{
        String orderNum;
        String phoneNumber;
        String address;
        String date;
        String orderTime;
        int orderPrice;
        String menuNum;

        public Client(String orderNum, String phoneNumber,
                      String address, String date, String orderTime,
                      int orderPrice, String menuNum) {
            this.orderNum = orderNum;
            this.phoneNumber = phoneNumber;
            this.address = address;
            this.date = date;
            this.orderTime = orderTime;
            this.orderPrice = orderPrice;
            this.menuNum = menuNum;
        }

        @Override
        public String toString() {
            return "Client{" +
                    "orderNum='" + orderNum + '\'' +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    ", address='" + address + '\'' +
                    ", date=" + date +
                    ", orderTime='" + orderTime + '\'' +
                    ", orderPrice=" + orderPrice +
                    ", menuNum='" + menuNum + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Info info = new Info(180, 78);
        Client client = new Client("202011020003",
                "01023450001", "서울시 강남구 역삼동 111-333",
                "20201102", "130258", 35000, "0003");

        System.out.println(info.toString());
        System.out.println(client.toString());

        /*
        result
        Info{tall=180, weight=78}
        Client{orderNum='202011020003', phoneNumber='01023450001',
            address='서울시 강남구 역삼동 111-333', date=20201102,
            orderTime='130258', orderPrice=35000, menuNum='0003'}
        */
    }
}