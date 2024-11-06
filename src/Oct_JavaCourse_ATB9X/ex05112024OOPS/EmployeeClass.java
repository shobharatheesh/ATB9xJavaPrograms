package Oct_JavaCourse_ATB9X.ex05112024OOPS;

public class EmployeeClass {

    //attributes
    String name;
    int id;
    String company;
    String designation;
    int salary;

    //constructor

    EmployeeClass(String name , int id , String company,String designation, int salary)
    {
        this.name = name;
        this.id =id;
        this.company = company;
        this.designation = designation;
        this.salary =salary;
    }

    //behaviour

    void work()
    {
        System.out.println(name +" is working as a Employee in " +company);
    }

    void work1()
    {
        System.out.println(name +" is working as a Employee in " +company);
    }

    void DisplayInfo()
    {

        System.out.println("Name : " +name);
        System.out.println("ID: " +id);
        System.out.println("Company: "+company);
        System.out.println("Designation: "+designation);
        System.out.println("Salary: "+salary);

    }
}
