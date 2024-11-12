package Oct_JavaCourse_ATB9X.PolyMethodOverloding;

public class MainRunnerClass {

    public static void main(String[] args) {

        MathOperation m = new MathOperation();
         m.add(10,10);
         m.add(1,2,3);

        System.out.println("Sum of 2 params: " +m.add(10, 10));
        System.out.println("Sum of 3 params: " +m.add(1,2,3));
    }
}
