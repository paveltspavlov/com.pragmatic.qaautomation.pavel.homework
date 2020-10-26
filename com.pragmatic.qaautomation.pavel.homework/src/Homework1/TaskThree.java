package Homework1;

import java.util.Scanner;

public class TaskThree {

    public static void main(String[] args) {

        Scanner getNum = new Scanner(System.in);
        System.out.println("Enter first number:");
        int Num1 = getNum.nextInt();

        System.out.println("Enter second number:");
        int Num2 = getNum.nextInt();

        if (Num1 == Num2) {
            System.out.println("Number " + Num1 + " should be different " + Num2);
            return;
        } else if (Num1 == 0 && Num2 == 0) {
            System.out.println("Number " + Num1 + " and " + Num2+" should be different than 0");
            return;
        }

            Num1=Num1+Num2;
            Num2=Num1-Num2;
            Num1=Num1-Num2;

        System.out.println("The numbers are exchanged");
        System.out.println("The first one now is "+Num1+" and the second one is "+Num2);

    }
}
