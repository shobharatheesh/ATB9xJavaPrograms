package JavaLearning.ex_09102024;

public class LargestNum {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 25;
        int num3 = 15;

        int largest = num1;

        if(num2 > largest) {
            largest = num2;
        }

        if(num3 > largest){
            largest = num3;

        }

        System.out.println("The largest number is : " +largest);
    }
}
