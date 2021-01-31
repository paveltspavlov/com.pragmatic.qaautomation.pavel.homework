package Homework4Task2;

import java.util.Scanner;

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
        yearInCollege = 2;
        isDegree = false;
        money = 0;
    }

    Student(double grade, int yearInCollege, boolean isDegree, double money){
        this();
        this.name = "Bai Hui";
        this.subject = "TUT";
        this.age = 19;

    }

    void upYear() {

            if (isDegree) {
                System.out.println("The student has finished his education");
                return;
            }

            yearInCollege++;

            if(yearInCollege <= 4){
                isDegree = false;
                System.out.println("The student is "+yearInCollege+" year in college");
            }else{
                isDegree=true;
                System.out.println("The student has finished his education");

            }

    }

    double receiveScholarship(double min, double amount){
        Scanner minAge = new Scanner(System.in);
        min = minAge.nextDouble();

        if(grade>=min  && age<30){
            money=+amount;

        }
        System.out.println("Student's money are "+amount);
        return money;
    }
}