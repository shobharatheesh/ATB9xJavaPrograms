package Oct_JavaCourse_ATB9X.ex_HierarachyInheritance;

public class Student extends Person{

    //attributes
    int studentId;

    //constructor

    Student(String name ,int age ,int studentId){
        super(name, age);
        this.studentId = studentId;

    }

    //behaviour or method to display student
    public void displayInfoStudent()
    {
        displayDetailsPerson();
        System.out.println("Student id: " +studentId);
    }



}
