import java.util.Arrays;
import java.util.Scanner;

class BubbleSortOfArray
{
    public static void main()
    {
        //init scanner
        Scanner reader = new Scanner(System.in);

        //ask for lenght and members
        System.out.println("What is the lenght of array?");
        int n = reader.nextInt();
        //make array 
        int[] array = new int[n];
        
        //add members
        System.out.println("Enter the " + n + " elements of the array");
        for (int i = 0; i < n; i++){
            System.out.print("["+i+"]=");
            array[i] = reader.nextInt();
        }

        // before sort
        System.out.println("Array before the sort: " + Arrays.toString(array));

        //sort the array using Bubble sort
        int swaps = 0;
        //loop for number of passes equal to lenght of array
        for (int i = 0; i < n; i++){
            //compare each nearby element
            for (int j = 0; j < n-i-1; j++){
                //switch elements using temporary hold in t and increas swap counter
                if(array[j] > array[j+1]) {
                    int t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                    swaps++;
                }
            }
        }
        // print sorted loop and number of swaps
        System.out.println("Sorted array is : "+Arrays.toString(array));
        System.out.println("Number of swaps done is : "+swaps);
    }
}