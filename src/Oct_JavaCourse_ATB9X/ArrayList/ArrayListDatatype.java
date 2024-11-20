package Oct_JavaCourse_ATB9X.ArrayList;

import java.util.ArrayList;

public class ArrayListDatatype {

    public static void main(String[] args)
    {

        //collection list = new ArrayList();  Dynamic dispatch
        //List List1 = new ArrayList(); Dynamic dispatch

        //ArrayList<String> student = new ArrayList<>();
        ArrayList  student = new ArrayList();

        student.add("Shobha");
        student.add("Rao");
        student.add("Rao"); //duplicate is not allowed
        student.add("Diya");
        student.add(123); //incompatible types: int cannot be converted to java.lang.String
        student.add(true);  //different datatype is not allowed.incompatible types: boolean cannot be converted to java.lang.String
        student.add(null);

        System.out.println(student);






    }
}
