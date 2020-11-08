package Homework2;

import java.util.Scanner;

public class TaskEightHW2 {
    public static void main(String[] args) {

        Scanner getNum = new Scanner(System.in);
        System.out.println("Enter a column:");
        int column = getNum.nextInt();

        switch (column){
            case 1:
                System.out.println("0");
                break;
            case 2:
                System.out.println("11");
                System.out.println("33");
                break;
            case 3:
                System.out.println("222");
                System.out.println("444");
                System.out.println("666");
                break;
            case 4:
                System.out.println("3333");
                System.out.println("5555");
                System.out.println("7777");
                System.out.println("9999");
                break;
            default:
                System.out.println("Please enter a number from 1 to 4");

        }

    }
}
