import java.util.Scanner;
import java.util.Arrays;

class SpiralTraversalOfMatrix
{
    public static void main(String[]args)
    {
        //traverse a matrix in spiral order
        //user inpout is dimentsions first then elements
        Scanner reader = new Scanner(System.in);

        //ask for lenght and members
        System.out.print("What is the number of rows? (nxm) n=");
        int n = reader.nextInt();
        System.out.print("What is the number of columns? (nxm) m=");
        int m = reader.nextInt();

        //make array 
        int[][] array = new int[n][m];
        
        //add members
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print("["+i+"]["+j+"]=");
                array[i][j] = reader.nextInt();
            }
            System.out.println();
        }
        //print array (debug)
        System.out.println(Arrays.deepToString(array));

        //maybe swithc m and n
        int top = 0;
        int bot = n - 1; 
        int left = 0;
        int right = m - 1;

        while (top<= bot && left <= right){
            //left to right
            for (int i = left; i <= right; i++) {
                System.out.print(array[top][i])+" ";
            }
            top++;
            //top to bottom
            for (int i = top; i <= bot; i++) {
                System.out.print(array[i][right]+" ");
            }
            right--;
            //right to left
            for (int i = right; i >= left; i--) {
                System.out.print(array[bot][i]+" ");
            }
            bot--;
            //bottom to top
            for (int i = bot; i <= top; i--) {
                System.out.print(array[i][left]+" ");
            }
            left++;
        }

        reader.close();
    }
};