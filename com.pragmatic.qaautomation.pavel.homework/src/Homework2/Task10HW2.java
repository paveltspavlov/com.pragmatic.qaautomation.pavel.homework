package Homework2;

import java.util.Scanner;

public class Task10HW2 {
    public static void main(String[] args) {

        Scanner getNum = new Scanner(System.in);
        System.out.println("Enter the number to check:");
        int num = getNum.nextInt();

//        int buff%num== 0;
        if(num%num==0){
            System.out.println("Числото е просто");
        }else {
            System.out.println("Числото не е просто");
        }

    }
}
