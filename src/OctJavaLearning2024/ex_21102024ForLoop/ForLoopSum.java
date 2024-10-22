package OctJavaLearning2024.ex_21102024ForLoop;

public class ForLoopSum {

    public static void main(String[] args) {

        int sum = 0;
        System.out.println("Natural numbers are : ");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            sum = sum + i;
        }

        System.out.println("Sum of the Natural numbers: "+sum);
    }
}
