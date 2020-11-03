package Homework2;

import java.util.Scanner;

public class TaskSixHW2 {
    public static void main(String[] args) {

//        Грешно подадено условие. Трябва да е "Сбора на всички числа от 1 до въведеното число"
//        Задача 6:Да се прочете число от екрана(конзолата) и да се изведесбора на всички числа между 1 и въведеното число.

        Scanner getNum = new Scanner(System.in);
        System.out.println("Enter a number:");
        double Num = getNum.nextDouble();

        double sum=0;
        int i=1;
        double buff = Num;

        if (Num>0){while(i <= buff){
            sum = sum+Num;
            Num--;
            i++;
            }
        }else if(Num<0){
            while(i > buff){
                sum = sum+Num;
                Num++;
                i--;
            }
        }
        System.out.println(sum);
    }
}
