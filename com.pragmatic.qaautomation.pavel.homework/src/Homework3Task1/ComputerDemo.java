package Homework3Task1;

public class ComputerDemo {

    public static void main(String[] args) {
        Computer computerOne = new Computer();
        Computer computerTwo = new Computer();

        computerOne.year = 2008;
        computerOne.price = 1200;
        computerOne.isNotebook = true;
        computerOne.hardDiscMemory = 4096;
        computerOne.freeMemory = 2048;
        computerOne.operationSystem = "Linux";

        computerTwo.year = 2015;
        computerTwo.price = 1500;
        computerTwo.isNotebook = false;
        computerTwo.hardDiscMemory = 6146;
        computerTwo.freeMemory = 4096;

    }

}
