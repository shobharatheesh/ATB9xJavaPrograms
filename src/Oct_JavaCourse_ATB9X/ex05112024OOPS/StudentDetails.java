package Oct_JavaCourse_ATB9X.ex05112024OOPS;

public class StudentDetails {

    //attributes

    String name;
    int age;
    char grade;

    //constructor
    StudentDetails(String name , int age , char grade)
    {
        this.name  = name;
        this.age   =  age;
        this.grade = grade;
    }


    //method
    void displayDetails()
    {
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Grade: " +grade);
    }
}
