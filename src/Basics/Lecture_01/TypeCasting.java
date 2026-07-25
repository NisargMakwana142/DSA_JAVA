package Basics.Lecture_01;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // destination type should be more than source type
        //example :- float > int
        float num = input.nextFloat(); //input - 34, output - 34.0
        System.out.println(num);

        int number ='A';
        System.out.println(number); //output - 65

        int num2 = (int) 57.4;  //input - 57.4, output - 57
        System.out.println(num2);

        int a = 257; //output - 1 => 257 % 256 = 1
        byte b = (byte) a; //max value of byte is 256
        System.out.println(b);
    }
}
