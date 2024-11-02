package Oct_JavaCourse_ATB9X.ex_29102024Arrays;

public class Arrays_2D_Iterate {

    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3},{4,5,6}, {7,8,9}};

       //System.out.println(matrix.length);
        //System.out.println(matrix[1][2]);
        //System.out.println(matrix[2][1]);
        //System.out.println(matrix[1][1]);

        for(int i=0; i< matrix.length;i++){
            for(int j=0;j< matrix.length ;j++)
            {

                System.out.print(matrix[i][j]);
                System.out.print(" ");

            }
            System.out.println("");
        }


    }
}
