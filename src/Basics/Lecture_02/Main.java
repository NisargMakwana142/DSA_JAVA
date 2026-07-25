package Basics.Lecture_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //if-else
        /*
        if(true or false){
            //body
        } else {
            //do-this
         */
        System.out.print("Enter Salary: ");
        int salary = sc.nextInt();
        if(salary > 10000){
            salary += 2000;
        } else {
            salary += 1000;
        }

        System.out.println("Salary with bonus: "+salary);


        //multiple if-else
        int num = sc.nextInt();
        if(num>10){
            num += 10;
        } else if (num<5) {
            num += 5;
        } else {
            num += 1;
        }

        System.out.println(num);

    }
}
