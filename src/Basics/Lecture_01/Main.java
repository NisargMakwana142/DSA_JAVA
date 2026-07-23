package Basics.Lecture_01;
//'Lecture_01' is a subfolder in 'Basics' folder

import java.util.Scanner;
//imports 'Scanner' class to our file

public class Main {

    // Entry Point of java program
    public static void main(String[] args) {
        /*
        public - Accessible to the JVM from outside the class
        static - Can be called without creating an object of the class
        void - returns nothing
        main - Special method name recognized by the JVM as the starting point
        String[] args - Command-line arguments passed to the program
         */

        System.out.println("Hello, World!");
        /*
        System is a class that contains a variable 'out' of type/class PrintStream
        println is method of PrintStream

        here 'out' is standard output
         */

        Scanner sc = new Scanner(System.in);
        /*
        A simple text scanner which can parse primitive
        types and strings using regular expressions.

        System.in tells us where to take input from
        System.in - standard input - keyboard input

        new - used to create new object

        sc - variable that points to Scanner class
         */

        System.out.println(sc.nextInt());
        /*
        nextInt() - takes integer as input
         */
    }

}
