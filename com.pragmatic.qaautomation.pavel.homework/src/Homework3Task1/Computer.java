package Homework3Task1;
import java.lang.String;
import java.util.Scanner;

public class Computer {
    int year;
    float price;
    boolean isNotebook;
    float hardDiscMemory;
    double freeMemory;
    String operationSystem = "Windows";

    void changeOperationSystem(String newOperationSystem) {
        System.out.println("The old OS is"+operationSystem);
//        Scanner getOS = new Scanner(System.in);
//        System.out.println("Enter new OS:");
//        newOperationSystem = getOS.next();
        System.out.println("The new OS is"+newOperationSystem);
    }

    void useMemory (double memory) {
//        Scanner getMemory = new Scanner(System.in);
//        System.out.println("Enter available memory:");
//        double usedMemory = getMemory.nextDouble();
//
//        Scanner getReducedMemory = new Scanner(System.in);
//        System.out.println("Enter reduced memory:");
//        freeMemory = getMemory.nextDouble();
//
//        if (freeMemory >= usedMemory) {
//            System.out.println("Not enough free memory!");
//            return;
//        } else {
//            freeMemory= usedMemory - freeMemory;
//            System.out.println(freeMemory+" is the remaining memory");
//        }
        if (memory >= freeMemory) {
            System.out.println("Not enough free memory!");
        } else {
            freeMemory= freeMemory - memory;
            System.out.println(freeMemory+" is the remaining memory");
        }
    }
}
