package Oct_JavaCourse_ATB9X.ex_HierarachyInheritance;


public class MainRunnerClass {
    public static void main(String[] args) {

        Student s = new Student("shobha",28,11);
        System.out.println("Student details: ");
        s.displayInfoStudent();

        System.out.println();

        Teacher t = new Teacher("ratheesh",30,"Java");
        System.out.println("Teacher Details: ");
        t.DisplayInfoTeach();



    }






}
