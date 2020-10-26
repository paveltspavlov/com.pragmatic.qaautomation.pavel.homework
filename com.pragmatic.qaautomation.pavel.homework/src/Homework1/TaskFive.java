package Homework1;

import java.util.Arrays;
import java.util.Scanner;

public class TaskFive {

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

        if (Num1>Num2 && Num2>Num3){
            System.out.println(Num1+" "+Num2+" "+Num3);
               }else if (Num2>Num1 && Num1>Num3){
                System.out.println(Num2+" "+Num1+" "+Num3);
                    } else if (Num3>Num2 && Num2>Num1){
                    System.out.println(Num3+" "+Num2+" "+Num1);
                        } else if (Num3>Num1 && Num1>Num2){
                        System.out.println(Num3+" "+Num1+" "+Num2);
                            } else if (Num2>Num3 && Num3>Num1){
                            System.out.println(Num2+" "+Num1+" "+Num1);
                            }
    }
}