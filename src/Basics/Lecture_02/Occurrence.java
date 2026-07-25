package Basics.Lecture_02;

    //find the Occurrence of number 3 in n

public class Occurrence {
    public static void main(String[] args) {


        int n = 3283498;
        int count = 0;
        while (n>0){
            int rem = n%10;
            if (rem == 3){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
