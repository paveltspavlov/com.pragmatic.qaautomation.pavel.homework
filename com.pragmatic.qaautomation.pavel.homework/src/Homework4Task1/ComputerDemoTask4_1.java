package Homework4Task1;

public class ComputerDemoTask4_1 {

    public static void main(String[] args) {
        ComputerTask4_1 computerTask41One = new ComputerTask4_1();
        ComputerTask4_1 computerTask41Two = new ComputerTask4_1();

        computerTask41One.year = 2008;
        computerTask41One.price = 1200;
        computerTask41One.isNotebook = true;
        computerTask41One.hardDiscMemory = 4096;
        computerTask41One.freeMemory = 2048;
        computerTask41One.useMemory(1948);
        computerTask41One.operationSystem = "Linux";

        computerTask41Two.year = 2015;
        computerTask41Two.price = 1500;
        computerTask41Two.isNotebook = false;
        computerTask41Two.hardDiscMemory = 6146;
        computerTask41Two.freeMemory = 4096;
        computerTask41Two.operationSystem = "Linux";
        computerTask41Two.changeOperationSystem("MacOS");

    }

}
