package javaBasic.ch02;

public class Section06 {
    static class Student{
        public int studentNumber;
        public String studentName;
        public int grade;

        public Student(int num, String name, int grade){
            this.studentName = name;
            this.studentNumber = num;
            this.grade = grade;
        }

        public Student(){}

        public String showStudentInfo(){
            int localVar;
            return studentName + ' ' + studentNumber + " " + grade;

            //오류 발생! localVar은 초기화되지 않으므로 (멤버 변수는 0이나 Null로 초기화)
            //return studentName + ' ' + studentNumber + " " + grade + localVar;
        }
    }
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.toString());
    }
}
