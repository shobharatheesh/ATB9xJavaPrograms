package Oct_JavaCourse_ATB9X.Task_08112024Array1OOPs;

public class MainRunnerClassArray1 {

    public static void main(String[] args) {

        //creating an array of Student objects

        StudentATB1[] students = new StudentATB1[3];

        students[0] = new StudentATB1("Shobha", 11, "Java Selenium");
        students[1] = new StudentATB1("Ratheesh", 12, "AWS");
        students[2] = new StudentATB1("Diya", 13, "Python");

        //displaying each student details using ToString()

        System.out.println("Student Details: ");
        for (StudentATB1 student : students) {
            System.out.println(student.toString());

        }
    }
}

