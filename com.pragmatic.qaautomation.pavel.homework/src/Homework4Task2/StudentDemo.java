package Homework4Task2;

public class StudentDemo {
    public static void main(String[] args) {

        Student Ivan = new Student();
        Ivan.upYear();
        Ivan.receiveScholarship(3,300);
        System.out.println("Ivan's money"+Ivan.money);
    }
}
