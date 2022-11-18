package javaBasic.ch02;

public class Section22 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,0}, {4,5,6,0}};

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("length : " + arr[i].length);
            System.out.println();
        }
    }
}
