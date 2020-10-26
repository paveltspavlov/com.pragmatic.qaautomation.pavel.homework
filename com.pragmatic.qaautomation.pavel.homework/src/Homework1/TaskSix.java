package Homework1;

import java.util.Scanner;

public class TaskSix {

    public static void main(String[] args) {

        Scanner getNum = new Scanner(System.in);
        System.out.println("Enter first number:");
        int Num1 = getNum.nextInt();

        System.out.println("Enter second number:");
        int Num2 = getNum.nextInt();

        System.out.println("Enter third number:");
        int Num3 = getNum.nextInt();

        if (Num1 == Num2 && Num1 == Num3 && Num2 == Num3) {
            System.out.println("Number " + Num1 + ", " + Num2 + ", and" + Num3 + " should be different ");
            return;
        } else if (Num1 == 0 && Num2 == 0 && Num3 == 0) {
            System.out.println("Number " + Num1 + ","+Num2+"and " + Num3+" should be different than 0");
            return;
        }

        int buff= Num3;

        Num3 = Num1;
        Num1 = Num2;
        Num2 = buff;

        System.out.println(Num1 + " "+ Num2 + " " + Num3);

    }
}
