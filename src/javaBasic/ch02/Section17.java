package javaBasic.ch02;

public class Section17 {
    static class Employee{
        String  name;
        private static int serialNum = 1000;

        public Employee(){
            serialNum++;
        }
        public int getSerialNum(){
            return serialNum;
        }
        public void increaseSerialNum(){
            serialNum++;
        }
        public static void setSerialNum(int serialNum){
            Employee.serialNum = serialNum;

            //인스턴스 생성 전에 호출될 수 있으므로
            //static 메서드 내부에서는 인스턴스 변수를 사용할 수 없음
            //this.name = "Kevin";
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();

        emp1.getSerialNum();
        Employee.setSerialNum(10001);

        System.out.println(emp1.getSerialNum());
        emp1.increaseSerialNum();
        System.out.println(emp2.getSerialNum());
//        결과
//        10001
//        10002
    }
}
