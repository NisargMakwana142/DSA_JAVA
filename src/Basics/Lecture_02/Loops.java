package Basics.Lecture_02;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //for-loop
        //use when number of iteration is known
        /*
            for(initialisation; condition; increment/decrement){
                //body
            }
         */
        for(int i = 1; i <= 5 ; i++){
            System.out.println(i);
        }

        for (int j = 5; j>=1; j--){
            System.out.println(j);
        }

        //print number 1 to n
        System.out.print("enter num: ");
        int n = sc.nextInt();
        for (int num = 1; num <= n ; num++) {
            System.out.print(num + " ");
        }
        System.out.println("\n");




        //while-loop
        //use when number of iteration is not known
        /*
            while(condition){
                //body
            }
         */

        int num2 = 1;
        while(num2 <= 5){
            System.out.println(num2);
            num2++;
        }


        //do-while loop
        //do-while will always execute at-least once
        //the content in the 'do' block will be executed even if the while condition is false
        /*
            do{
                //body
            } while (condition);
         */
        int num3 = 1;
        do {
            System.out.println(num3);
            num3++;
        } while (num3 <= 5);

    }
}
