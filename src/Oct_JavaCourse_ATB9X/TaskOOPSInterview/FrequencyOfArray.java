package Oct_JavaCourse_ATB9X.TaskOOPSInterview;

public class FrequencyOfArray {
    public static void main(String[] args) {

        int arr[] = {1,2,2,3,4,4,4,5};
        System.out.println(arr.length);

        int n = arr.length;

        System.out.println("Element frequencies: ");

        for(int i =0 ; i<n; i++)
        {
            //skip already processed elements

            if (arr[i] == -1)
            {
               continue;
            }

            int count =1; //count the current element

            //check for duplicates

            for(int j = i +1 ; j<n; j++)
            {
                if (arr[i] ==arr[j])
                {
                    count++;
                    arr[j]  = -1;
                }
            }
            //print the frequency of the current element

            System.out.println(arr[i] + " -- > " +count);
        }








    }
}
