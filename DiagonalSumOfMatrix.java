import java.util.Arrays;
import java.util.Scanner;

class DiagonalSumOfMatrix
{
    public static void main(String[]args)
    {
        //calculate sum of main diagonal and secondary diagonal from a square matrix from user input
        Scanner reader = new Scanner(System.in);

        //ask for lenght and members
        System.out.print("What is the size of the matrix? (nxn) n=");
        int n = reader.nextInt();
        //make array 
        int[][] array = new int[n][n];
        
        //add members
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print("["+i+"]["+j+"]=");
                array[i][j] = reader.nextInt();
            }
            System.out.println();
        }

        System.out.println(Arrays.toString(array));


        reader.close();
    }
};