package Homework5Task1;

public class College {

    public static void main(String[] args) {

        Student Ivan = new Student("Ivan","Informatics",20);
        Student Georgi = new Student("Georgi","Phylosophy",19);
        Student Pesho = new Student();
        Student Stoyan = new Student();

       StudentGroup group1 = new  StudentGroup("Computer Science");
    }

}


//    Да се напише клас College (с main метод), който демонстрира използването на класовете Student и
//    StudentGroup(Създава няколко студента, добавя стипендия на някои от тях,
//    прехвърля някои от тях в по-горна година. Създава няколко групи от студенти, добавя студенти в тях,
//    изкарва името на най-добрия студент от някоя от групите....)