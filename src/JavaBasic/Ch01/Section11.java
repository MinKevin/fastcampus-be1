package JavaBasic.Ch01;

public class Section11 {
    public static void main(String[] args) {
        int num1 = 2;
        num1 <<= 1;
        System.out.println(num1);//4

        num1 >>= 1;
        System.out.println(num1);//2

        num1 = 5; //101
        num1 &= 4;//100
        System.out.println(num1);//100

        num1 |= 7;//111
        System.out.println(num1);//7 (111)

        num1 ^= 4; //^는 XOR => 서로 다르면 1
        System.out.println(num1);//3 (011)
    }
}
