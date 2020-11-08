package Homework2;

import java.util.Scanner;

public class TaskSevenHW2 {
    public static void main(String[] args) {

        Scanner getNum = new Scanner(System.in);
        System.out.println("Enter a number:");
        int Num = getNum.nextInt();

        int i2 = 3;

//       do {
//           if (i2 % 3 == 0 && Num>0) {
//               System.out.println(i2);
//               i2++;
//               Num--;
//           }
//
//       }while (Num==0);

        do {

            System.out.println(i2);
            i2 += 3;
            Num--;
        }while (Num>0);
    }
}
