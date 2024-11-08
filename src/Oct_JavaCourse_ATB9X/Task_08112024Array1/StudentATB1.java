package Oct_JavaCourse_ATB9X.Task_08112024Array1;

public class StudentATB1{

    //attributes
     String name;
     int id;
     String course;

    //Constructor

    public StudentATB1(String name , int id , String course)
    {
        this.name = name;
        this.id = id;
        this.course= course;
    }

    //behaviour
  //to string method to print details


   public String toString()
    {
        String s = "Student[Name: " +name + ", ID: "+id+", Course: "+course+ "]";
        return s;
    }
}
