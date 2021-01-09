package Homework4Task1;

public class ComputerTask4_1 {
    int year;
    double price;
    boolean isNotebook;
    double hardDiscMemory;
    double freeMemory;
    String operationSystem;

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

    ComputerTask4_1(){
        isNotebook = false;
        operationSystem = "Win XP";
    }

    ComputerTask4_1(int year, double price, double hardDiskMemory, double freeMemory){
        //calls the default constructor
        this();
        //initialize the fields
        this.year = year;
        this.price = price;
        this.hardDiscMemory = hardDiskMemory;
        this.freeMemory = freeMemory;

    }

    ComputerTask4_1(int year, double price, boolean isNotebook,double hardDiskMemory, double freeMemory, String operationSystem){
        this.year = year;
        this.price = price;
        this.isNotebook = isNotebook;
        this.hardDiscMemory = hardDiskMemory;
        this.freeMemory = freeMemory;
        this.operationSystem = operationSystem;
    }

    int comparePrice(ComputerTask4_1 otherComp){
        if (price > otherComp.price) {
            return -1;
        } else if(price < otherComp.price){
            return 1;
        }
        return 0;
    }
}
