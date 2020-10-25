package Homework1;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {

        int zero = 0;

        Scanner getNum = new Scanner(System.in);
        System.out.println("Enter first number:");
        int Num1 = getNum.nextInt();

        System.out.println("Enter second number:");
        int Num2 = getNum.nextInt();

        if (Num1 == Num2) {
            System.out.println("Number " + Num1 + " should be different " + Num2);
            return;
//        } else if (Num1 == 0 && Num2 == 0) {
//            System.out.println("Number " + Num1 + " and " + Num2+" should be different than 0");
//            return;
        }

        int sum = Num1+Num2;
        System.out.println("The sum of "+Num1+" and "+Num2+" is "+sum);

        if (Num1>Num2) {
            int dif1 = Num1 - Num2;
            System.out.println(Num1+" minus "+Num2+" is " + dif1);
            }
            else if (Num2 > Num1){
                int dif2 = Num2 - Num1;
                System.out.println(Num2 + " minus "+Num1+" is "+dif2);
            }

        int mult = Num1*Num2;
            System.out.println(Num1+" times"+Num2+" is"+mult);

        if (Num1>Num2 && Num1!= zero && Num2!= zero){
            int division = Num1/Num2;
            int mod = Num1%Num2;
            System.out.println(Num1 + " divided by "+Num2+" is "+division);
            System.out.println("The module of "+Num1 + " divided by "+Num2+" is "+mod);
        }
            else if (Num1 != zero && Num2 != zero){
                int division2 = Num2/Num1;
                int mod2 = Num2 % Num1;
            System.out.println(Num1 + " divided by "+Num2+" is "+division2);
            System.out.println("The module of "+Num1 + " divided by "+Num2+" is "+mod2);
        }
    }
    }