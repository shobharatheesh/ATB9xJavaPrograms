package Oct_JavaCourse_ATB9X.ex_MultiLevel_Inheritance1;

public class Employee extends Person {

    //attributes for employee class
    int employeeId;

    //constructor for employee class

    Employee(String name, int age, int employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    //Method to display employee details

    public void displayEmpInfo() {

        displayInfo();
        System.out.println("Employee id: " + employeeId);
    }
}

