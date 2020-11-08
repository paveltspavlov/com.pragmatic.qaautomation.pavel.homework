package Homework2;

import java.util.Scanner;



//Задача 9:Да се прочетат 2 числа от клавиатурата А и В.
// Да се изведат всички числа от А до В на степен 2(разделени с запетая).
// Ако някое число е кратно на 3, да се  изведе  съобщение  че  числото  сепропуска  „skip  3“.
// Ако  сумата  от  всички изведени  числа  (без  пропуснатите)  стане по-голямаот  200,  да  се  прекрати извеждането.

//Example: Въдете А:1 Въведете B107
// Output: 1, 4, skip 3, 16, 25, skip 6, 49, 64, skip 9, 100

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
