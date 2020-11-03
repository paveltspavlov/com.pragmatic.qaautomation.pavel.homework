package Homework2;

import java.util.Scanner;

public class TaskFiveHW2 {
    public static void main(String[] args) {

        Scanner getNum = new Scanner(System.in);
        System.out.println("Enter first number:");
        double Num1 = getNum.nextDouble();

        System.out.println("Enter second number:");
        double Num2 = getNum.nextDouble();

        if (Num1 == Num2) {
            System.out.println("Number " + Num1 + " should be different " + Num2);
            return;
        } else if (Num1 == 0 && Num2 == 0) {
            System.out.println("Number " + Num1 + " and " + Num2+" should be different than 0");
            return;
        }

        if(Num1<Num2) {
            do {
                System.out.println(Num1);
                Num1++;
            } while (Num1 <= Num2);
        }else {
            do {
                System.out.println(Num2);
                Num2++;
            } while (Num2 <= Num1);
        }
    }
}
