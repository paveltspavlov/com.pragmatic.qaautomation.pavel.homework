package Homework4Task2;

public class Student {
    String name;
    String subject;
    double grade;
    int yearInCollege;
    int age;
    boolean isDegree;
    double money;

    Student(){
        grade = 4.0;
        yearInCollege = 1;
        isDegree = false;
        money = 0;
    }

    Student(double grade, int yearInCollege, boolean isDegree, double money){
        this();
        name = "Bai Hui";
        subject = "TUT";
        age = 19;
    }

    void upYear(){

    }
}
