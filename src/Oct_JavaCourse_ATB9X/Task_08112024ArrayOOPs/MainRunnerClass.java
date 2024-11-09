package Oct_JavaCourse_ATB9X.Task_08112024ArrayOOPs;

public class MainRunnerClass {
   public static void main(String[] args) {

        //creating objects for class StudentsATB

        StudentATB s1 = new StudentATB("Shobha",11,"Java Selenium");
        StudentATB s2 = new StudentATB("Ratheesh",12,"AWS");
        StudentATB s3 = new StudentATB("Diya",13,"Python");

        // Display each Student information

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());

    }
}
