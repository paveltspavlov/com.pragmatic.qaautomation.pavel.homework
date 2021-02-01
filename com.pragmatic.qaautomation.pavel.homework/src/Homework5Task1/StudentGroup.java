package Homework5Task1;

public class StudentGroup{
    String groupSubject;
    Student[] students;
    int freePlace;

    StudentGroup(){
        this.students = new Student[5];
        freePlace = 5;
    }
    StudentGroup(String subject){
        this();
        groupSubject = "Computer Science";
    }

    void addStudent(Student s){
//        String subject = s.subject;
//        Student ivan = new Student();
//        int i = students.length;
//        do {
//            if (subject == groupSubject) {
//                this.students[i] = s;
//                i--;
//            }
//        }while (i<= students.length);
        int i = students.length;
        do{
            if (s.subject==groupSubject){
                students[i] = s;
                i--;
                freePlace--;
                return;
            }
        }while(i>0);
    }

    void emptyGroup() {
        int i = this.freePlace;
        if (students[i]>0) {
            students[freePlace] = null;
            i++;
            freePlace++;
        }
    }

}
