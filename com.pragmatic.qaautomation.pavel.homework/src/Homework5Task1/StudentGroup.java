package Homework5Task1;

import org.jetbrains.annotations.NotNull;

public class StudentGroup{
    String groupSubject;
    Student[] students;
    int freePlace;

    StudentGroup(){
        Student[] students = new Student[5];
        this.freePlace = 5;
    }
    StudentGroup(String subject){
        this();

    }

    void addStudent(@NotNull Student s){
        int i = students.length;
        do{
            if (s.subject == groupSubject){
                students[i] = s;
                i--;
                freePlace--;
                return;
            }
        }while(i>0);
    }

    void emptyGroup() {
        freePlace = 5;
        students[freePlace]=null;
    }

    String theBestStudent(Student best){
        for (int i = 0; i <= students.length; i++){
            int buff = i+1;

            if (students[buff].grade < students[buff+1].grade){
                best.grade = students[buff].grade;
            }else{
                best.grade = students[buff+1].grade;
            }
        }

        return best.name;
    }

    Student printStudentsInGroup(){
        int len=1;
        for (int i=1; i <= students.length; i++) {
            System.out.print("Student "+i+" information:");
            System.out.print("Student's name is"+students[i].name+", ");
            System.out.print("Student's subject is"+students[i].subject+", ");
            System.out.print("Student's grade is"+students[i].grade+", ");
            System.out.print("Student's age is"+students[i].age+", ");
            System.out.print("Student's year college is"+students[i].yearInCollege+", ");
            System.out.print("Student has finished college "+students[i].isDegree);
            System.out.println();
            len++;
        }


        return students[len];
    }
}
