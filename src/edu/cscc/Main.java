package edu.cscc;
import java.util.*;
/**
 * Code to Lab 7 Main Class
 * @author rdoult
 * @version 1.0
 **/

public class Main {

    private static Scanner input = new Scanner(System.in);

    /**
     * @param args String[] expects an array of Strings<br>
     * the  public static void main(String[] args) is the Access modifier making the main() method public<br>
     * Java main method does not return anything, that is why return type is void<br>
     * String[] args stores Java command line arguments and is an array of type java.lang.String class<br>
     * string h_pick is for human<br>
     * String c_pick is for computer<br>
     * String answer holds the input<br>
     * boolean is returned if invalid<br>
     * output with the the user by asking to make a choice
     * if the input is valid applied to
     * output asking user to input a choice checks the isValidPick method on
     * RPSLSpock class if not valid  output not valid and enters the do while loop to have user
     * re-input a valid response
     **/
    public static void main(String[] args) {
        String h_pick;
        String c_pick;
        String answer;
        boolean isValid;

        do {
            System.out.println("Let's play rock, paper, scissors, lizard, spock");
            do {
                System.out.print("Enter your choice: ");
                h_pick = input.nextLine();
                isValid = RPSLSpock.isValidPick(h_pick);
                if (!isValid) {
                    System.out.println(h_pick + " is not a valid choice");
                }
            } while (!isValid);

            c_pick = RPSLSpock.generatePick();
            System.out.print("Computer picked " + c_pick + "  ");

            if (c_pick.equalsIgnoreCase(h_pick)) {
                System.out.println("Tie!");
            } else if (RPSLSpock.isComputerWin(c_pick, h_pick)) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("You win!");
            }
    /**
    * @param isComputerWin  beats h_pick)
    * using if else loop to compare h_pick to method isComputerWin criteria
    **/
            System.out.print("Play again ('y' or 'n'): ");
            answer = input.nextLine();
        } while ("Y".equalsIgnoreCase(answer));
        System.out.println("Live long and prosper!");
    }
}
