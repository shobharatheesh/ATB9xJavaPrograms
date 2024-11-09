package Oct_JavaCourse_ATB9X.ex_MultiLevel_Inheritance1;

public class Manager extends Employee {

    String department;

    Manager(String name , int age,int employeeId,String department)
    {
        super(name,age,employeeId);
        this.department = department;

    }

    public void displayManagerInfo()
    {
        displayEmpInfo();
        System.out.println("Department: "+department);
    }
}
