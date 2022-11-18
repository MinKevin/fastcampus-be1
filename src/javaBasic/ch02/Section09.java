package javaBasic.ch02;

public class Section09 {
    static class Student{
        int studentId;
        String studentName;

        Subject korea;
        Subject math;

        Student(int studentId, String StudentName){
            this.studentId = studentId;
            this.studentName = studentName;

            korea = new Subject();
            math = new Subject();
        }

        public void setKoreaSubject(String name, int score){
            korea.subjectName = name;
            korea.score = score;
        }

        public void setMathSubject(String name, int score){
            math.subjectName = name;
            math.score = score;
        }

        public void showScoreInfo(){
            int total = korea.score + math.score;
            System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
        }
    }
    static class Subject{
        String subjectName;
        int score;
    }

    public static void main(String[] args) {
        Student studentLee = new Student(100, "Lee");
        studentLee.setKoreaSubject("국어", 100);
        studentLee.setMathSubject("수학", 99);

        Student studentKim = new Student(100, "Kim");
        studentLee.setKoreaSubject("국어", 50);
        studentLee.setMathSubject("수학", 65);

        studentLee.showScoreInfo();
        studentKim.showScoreInfo();
    }
}
