package Homework2;

import java.util.Scanner;

public class TaskNineHW2 {
    public static void main(String[] args) {
        Scanner getNum = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = getNum.nextInt();
        System.out.println("Enter first number:");
        int num2 = getNum.nextInt();

        do{
        int powerOfTwo = num1 ^ 2;
            num1++;
        int powerOfThree = powerOfTwo;
//            powerOfThree %= 3;
//        int twoHundred = powerOfTwo;
        for (int twoHundred=powerOfTwo;twoHundred==200;twoHundred+=powerOfTwo) {

            powerOfThree %= 3;
            if (powerOfThree == 0) {

                System.out.print("skip " + powerOfThree);
            } else if (powerOfTwo == 0) {
                System.out.print(powerOfTwo + ", ");
                }
            }
        }while (num1<=num2);
    }

}
