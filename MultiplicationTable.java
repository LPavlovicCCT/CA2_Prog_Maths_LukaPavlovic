import java.util.Scanner;

class MultiplicationTable
{
    public static void main(String[]args)
    {
        Scanner tableSize = new Scanner(System.in);
        //generate a multiplcation table using a 2Darray
        System.out.print("What size Multiplication table do you need? (nxn) n=");
        int n = tableSize.nextInt();

        //user defined size of table nxn
        int[][] multTable = new int[n][n];

        //populate the table with multiplaction values and display table
        for (int i = 0; i < n; i++){
            for (int j = 0; j<n; j++){
                multTable[i][j] = (i + 1) * (j+1);
            }
        }

        //print the table out
        for (int i = 0; i < n; i++){
            for (int j = 0; j<n; j++){
                System.out.print(multTable[i][j] + "  ");
            }
            System.out.println();
        }

        tableSize.close();
    }
};