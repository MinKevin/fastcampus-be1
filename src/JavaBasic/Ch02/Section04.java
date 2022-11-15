package JavaBasic.Ch02;

public class Section04 {
    static class Student{
        public int studentID;
        public String studentName;
        public String address;
        public void showStudentInfo(){
            System.out.println(studentName + ", " + address);
        }
        public String getStudentName(){
            return studentName;
        }
    }

    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.studentName = "이순신";
        studentLee.address = "서울";

        studentLee.showStudentInfo();

        Student studentKim = new Student();
        studentKim.studentName = "김유신";
        studentKim.address = "경주";

        studentKim.showStudentInfo();

        System.out.println(studentLee);
        System.out.println(studentKim);
        /*
        이순신, 서울
        김유신, 경주
        JavaBasic.Ch02.Section04$Student@6e8cf4c6
        JavaBasic.Ch02.Section04$Student@12edcd21
         */

    }

}
