package javaBasic.ch03;

public class Section02 {
    static class Customer {
        protected int customerID;
        protected String customerName;
        protected String customerGrade;
        int bonusPoint;
        double bonusRatio;

        public Customer() {
            customerGrade = "SILVER";
            bonusRatio = 0.01;
        }

        public int calcPrice(int price) {
            bonusPoint += price * bonusRatio;
            return price;
        }

        public String showCustomerInfo() {
            return customerName + "님의 등급은 " + customerGrade + "이며 보너스 포인트는 " + bonusPoint + "입니다.";
        }

        public int getCustomerID() {
            return customerID;
        }

        public void setCustomerID(int customerID) {
            this.customerID = customerID;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public String getCustomerGrade() {
            return customerGrade;
        }

        public void setCustomerGrade(String customerGrade) {
            this.customerGrade = customerGrade;
        }
    }

    static class VIPCustomer extends Customer {
//        상속받으면 부모 클래스의 필드와 메서드를 선언 없이 사용 가능
//        private int customerID;
//        private String customerName;
//        private String customerGrade;
//        int bonusPoint;
//        double bonusRatio;
        private int agentID; //담당 상담원
        double salesRatio;

        public VIPCustomer() {
            customerGrade = "VIP";
            bonusRatio = 0.05;
            salesRatio = 0.1;
        }

        public int getAgentID() {
            return agentID;
        }

        public void setAgentID(int agentID) {
            this.agentID = agentID;
        }
    }

    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setCustomerName("이순신");
        customer1.setCustomerID(10010);
        customer1.bonusPoint = 1000;
        System.out.println(customer1.showCustomerInfo());
        //이순신님의 등급은 SILVER이며 보너스 포인트는 1000입니다.

        VIPCustomer customer2 = new VIPCustomer();
        customer2.setCustomerName("김유신");
        customer2.setCustomerID(10020);
        customer2.bonusPoint = 10000;
        System.out.println(customer2.showCustomerInfo());
        //김유신님의 등급은 VIP이며 보너스 포인트는 10000입니다.

    }



}
