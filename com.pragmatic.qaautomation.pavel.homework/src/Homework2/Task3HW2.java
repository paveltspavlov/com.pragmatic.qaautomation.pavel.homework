package Homework2;

public class Task3HW2 {

    public static void main(String[] args) {

        double i1 = -10, i2 = 2;


        do {
            double mod2 = i1 % i2;
            if (mod2 != 0) {
                System.out.println(i1);
            }
            i1++;
        }while (i1 <= 10);
       }
    }