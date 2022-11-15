package me.day05.practice;

public class Practice5 {
    public static void main(String[] args){
        int answer = 0;
        for (int i = 1; i <= 100; i++){
            int nxtNum = i;
            for (int j = 1; j <= 100; j++){
                if (i * i + j * j > nxtNum * nxtNum)
                    nxtNum++;

                if (i * i + j * j == nxtNum * nxtNum){
                        answer++;
                        nxtNum++;
                }

                if (nxtNum > 100)
                    break;
            }
        }
        System.out.println(answer);
    }
}
