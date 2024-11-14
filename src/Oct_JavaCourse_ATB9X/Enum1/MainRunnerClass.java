package Oct_JavaCourse_ATB9X.Enum1;

public class MainRunnerClass {
    public static void main(String[] args) {

        for (Planet p : Planet.values()) {
            System.out.printf("Surface gravity on %s: %.2f m/s²%n", p, p.surfaceGravity());
        }

    }
}
