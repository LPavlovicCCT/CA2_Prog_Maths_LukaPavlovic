import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //init scanner
        Scanner reader = new Scanner(System.in);

        //while loop to enable repeats of the main function
        boolean repeat = true;
        while (repeat == true){

            //present options
            System.out.println("what would you like to do? Type an integer from 1 to 5");

            System.out.println("[1] Array Search");
            System.out.println("[2] Multiplication table usinf 2D Array");
            System.out.println("[3] Diagonal Sum of Matrix");
            System.out.println("[4] Spiral Transversal of Matrix");
            System.out.println("[5] Bubble sort - Sorting an Array");

            //make a selection
            int selection = reader.nextInt();

            //closes the scanner noot to interfere with scenners of functions
            //selector.close();

            //run the selected class
            if (selection == 1) {ArraySearch.main();}
            else if (selection == 2) {MultiplicationTable.main();}
            else if (selection == 3) {DiagonalSumOfMatrix.main();}
            else if (selection == 4) {SpiralTraversalOfMatrix.main();}
            else if (selection == 5) {BubbleSortOfArray.main();}
            else {System.out.println( "Thats not a valid choice.");}

            //ask to go again
            System.out.println("would you like to go again? [Y/N]");

            
            char pick = reader.next(".").charAt(0);

            //sets repeat var to false to stop the while loop
            if (pick == 'N' || pick == 'n'){
                repeat = false;
            }
        }
        reader.close();
    }
};
