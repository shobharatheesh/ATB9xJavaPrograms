package Oct_JavaCourse_ATB9X.StudentArrayExample;


class Student {
    private String name;
    private int id;
    private double grade;

    // Constructor
    public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    // toString method to display student details
    @Override
    public String toString() {
        return "Student [Name: " + name + ", ID: " + id + ", Grade: " + grade + "]";
    }
}
public class StudentArrayExample {
    public static void main(String[] args) {
        // Create an array of Student objects
        Student[] students = new Student[3];

        // Add Student objects to the array
        students[0] = new Student("Alice", 101, 89.5);
        students[1] = new Student("Bob", 102, 92.0);
        students[2] = new Student("Charlie", 103, 78.3);

        // Display each student's details using toString
        System.out.println("Student Details:");
        for (Student student : students) {
            System.out.println(student);


        }
    }
}
