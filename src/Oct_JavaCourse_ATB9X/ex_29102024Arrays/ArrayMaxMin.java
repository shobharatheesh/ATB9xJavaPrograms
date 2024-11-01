package Oct_JavaCourse_ATB9X.ex_29102024Arrays;

import java.util.Scanner;

public class ArrayMaxMin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int len = sc.nextInt();

        int[] num = new int[len];

        for (int i = 0; i < len; i++) {
            System.out.println("Enter the number : ");
            num[i] = sc.nextInt();
        }

        //Call the fucntion
        System.out.println("max number is : " +max(num));
        System.out.println("min number is : " +min(num));
    }

    public static int max(int[] num) {
        int max = num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
     return max;
    }

    public static int min(int[] num){
        int min = num[0];
        for (int i =0 ; i < num.length;i++)
        {
            if(num[i] < min ){
                min = num[i];
            }
        }
        return min;

    }
}
