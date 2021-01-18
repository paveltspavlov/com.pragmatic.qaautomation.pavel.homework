package Homework4Task1;

public class ComputerDemoTask4_1 {

    public static void main(String[] args) {
    ComputerTask4_1 Thinkpad = new ComputerTask4_1(2018,1500.00,true,500,12.00,"Windows 7");
    ComputerTask4_1 Alienware = new ComputerTask4_1(2014,2000,false, 2048,16, "Ubuntu");
    ComputerTask4_1 Probook = new ComputerTask4_1(2013,1200,750,8);
    ComputerTask4_1 Dell = new ComputerTask4_1(2018,2000,false,1024,16,"Windows 10");

    int priceComparison = Thinkpad.comparePrice(Alienware);
    }

}
