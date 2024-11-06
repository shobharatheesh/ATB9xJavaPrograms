package Oct_JavaCourse_ATB9X.ex05112024OOPS;

public class MainEmployee {

    public static void main(String[] args) {

        //Creating object of the class employee

        EmployeeClass emp = new EmployeeClass("Ratheesh", 1233, "CBTW","Technical", 10000);
        EmployeeClass emp1 = new EmployeeClass("Shobha" , 345, "Infosys","Testing",5000 );

        emp.work();
        emp.DisplayInfo();
        System.out.println("----------------------");
        emp1.work1();
        emp1.DisplayInfo();

    }
}
