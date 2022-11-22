package javaBasic.ch02;

import java.util.ArrayList;

public class Section24 {
    static class Subject{
        private String name;
        private int score;

        Subject(String name, int score){
            this.name = name;
            this.score = score;
        }

        public void showInfo(){
            System.out.println(name + " : " + score );
        }

        public int getScore(){
            return score;
        }
    }

    static class Student{
        private static int noCounter = 1000;
        int no;
        String name;
        ArrayList<Subject> subjectList;

        Student(String name){
            this.no = ++noCounter;
            this.name = name;
            subjectList = new ArrayList<Subject>();
        }

        public void addSubject(String name, int score){
            subjectList.add(new Subject(name, score));
        }

        public void showInfo(){
            System.out.println(name + "의 성적은 아래와 같습니다.");
            double average = 0.0;
            for (int i = 0; i < subjectList.size(); i++){
                subjectList.get(i).showInfo();
                average += (double)subjectList.get(i).getScore() / subjectList.size();
            }
            System.out.println("평균은 " + average + "입니다.");
        }
    }

    public static void main(String[] args) {
        Student Lee = new Student("Lee");
        Student Kim = new Student("Kim");

        Lee.addSubject("국어", 100);
        Lee.addSubject("수학", 50);

        Kim.addSubject("국어", 70);
        Kim.addSubject("수학", 85);
        Kim.addSubject("영어", 100);

        Lee.showInfo();
        Kim.showInfo();

//        Lee의 성적은 아래와 같습니다.
//        국어 : 100
//        수학 : 50
//        평균은 75.0입니다.
//        Kim의 성적은 아래와 같습니다.
//        국어 : 70
//        수학 : 85
//        영어 : 100
//        평균은 85.0입니다.
    }
}
