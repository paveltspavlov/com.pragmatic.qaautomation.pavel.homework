package Homework2;

import java.util.Scanner;

public class Task9HW2 {
    public static void main(String[] args) {
        Scanner getNum = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = getNum.nextInt();
        System.out.println("Enter second number:");
        int num2 = getNum.nextInt();

        int sum = 0;
        for(int i=num1;i<num2;i++){
            if(i%3==0){
                System.out.print("skip "+i+", ");
            }else {
                int num = i * i;
                System.out.print(num + ", ");
                sum+=num;
                if(sum>200){
                    break;
                }
            }
        }



    }

}
