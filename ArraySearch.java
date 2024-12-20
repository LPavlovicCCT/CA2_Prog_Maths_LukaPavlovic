import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch 
{
    public static void main()
    {
        // Take input as array lenght and then array members, then find first repeated element in the array
        //init scanner
        Scanner reader = new Scanner(System.in);

        //ask for lenght and members
        System.out.println("What is the lenght of array?");
        int lenght = reader.nextInt();
        //make array 
        int[] array = new int[lenght];
        
        //add members
        System.out.println("Enter the " + lenght + " elements of the array");
        for (int i = 0; i < lenght; i++){
            System.out.print("["+i+"]=");
            array[i] = reader.nextInt();
        }

        System.out.println(Arrays.toString(array));

        //boolean to keep track if we foudn the repeat
        boolean repeater = false;
        //loop trough each elemnt of array
        for (int  i = 0;i < lenght; i++){
            if (repeater == true) {break;}
            else {
                //compare element to each other element 
                for (int j = i + 1; j < lenght; j++){
                    if (array[i] == array[j]) {
                        //prints the repeating member
                        System.out.println("First repeating element is " + array[i]);
                        repeater = true;
                        break;
                    }
                }
            }
        }
        if (repeater == false) {System.out.println("No repeating elements found.");}
        // close scanner
        reader.close();
    }
};