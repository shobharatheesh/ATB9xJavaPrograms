package Oct_JavaCourse_ATB9X.ex_SimpleInherit4;

public class Employee extends Person {

    String jobTitle;

    public void displayInfoEmp()
    {
        displayPerInfo();
        System.out.println("Job Title : "+jobTitle);
    }
}
