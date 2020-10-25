package Homework1;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {

        Scanner getNum = new Scanner(System.in);
        System.out.println("Enter first number:");
        float Num1 = getNum.nextFloat();

        System.out.println("Enter second number:");
        float Num2 = getNum.nextFloat();

        if (Num1 > Num2){
            System.out.println("Number " + Num1 + " should be greater than "+ Num2);
            return;
        }
            else if (Num1 == Num2){
            System.out.println("Number " + Num1 + " should be greater than "+ Num2);
            return;
                }

        System.out.println("Enter third number:");
        float Num3 = getNum.nextFloat();

        if (Num3 > Num1 && Num3 < Num2){
            System.out.println("Number "+Num3+" is between "+Num1+" and "+Num2);
            }
            else if (Num3 < Num1){
                    System.out.println("Number "+Num3+"is smaller than "+Num1);
                    }
                else if (Num3 > Num2) {
                    System.out.println("Number " + Num3 + " is greater than " + Num1 + " and " + Num2);
                }
                    else if (Num3 == Num1){
                    System.out.println("Number " + Num3 + " is equal to"+ Num1);
                    }
                        else if (Num3 == Num2){
                             System.out.println("Number " + Num3 + " is equal to"+ Num2);
                            }
        }
    }
