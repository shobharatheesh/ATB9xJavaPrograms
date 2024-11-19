package Oct_JavaCourse_ATB9X.TaskOOPSInterview;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = { 10 , 20 , 30 , 40, 50};

        System.out.println("Reverse order of the Array : ");

        for(int i = arr.length -1 ; i>=0 ; i--)
        {
            System.out.print(arr[i] +" ");
        }
    }

}
