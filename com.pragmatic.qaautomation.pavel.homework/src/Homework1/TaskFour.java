package Homework1;

import java.util.Scanner;

public class TaskFour {

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
        if (Num1>Num2){
          System.out.println(Num1);
          System.out.println(Num2);
        }else {
            System.out.println(Num2);
            System.out.println(Num1);
        }
}
}