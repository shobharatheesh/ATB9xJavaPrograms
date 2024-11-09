package Oct_JavaCourse_ATB9X.ex_SimpleInherit10;

public class Student extends Person{

    int studentId;

    //constructor for student class
    public  Student(String name, int age ,int studentId)
    {
        super(name, age);
        this.studentId = studentId;
    }

    //method to display student -specific details

    public void displayInfoPer()
    {
        displayPersonInfo();
        System.out.println("Name: "+name+ " Age: "+age+ " StudentId: "+studentId);
    }
}
