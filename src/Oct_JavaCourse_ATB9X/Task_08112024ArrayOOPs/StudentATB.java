package Oct_JavaCourse_ATB9X.Task_08112024ArrayOOPs;

public class StudentATB {

    //attributes
    String name;
    int id;
    String course;

    //Constructor

    StudentATB(String name , int id , String course)
    {
        this.name = name;
        this.id = id;
        this.course= course;
    }

    //behaviour

   public String toString()
    {
        return "Student [Name: " +name + ", ID: "+id+", Course: "+course+ "]";
    }
}
