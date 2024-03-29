package edu.cscc;
import java.util.Random;
/**
 * Code to Lab 7 RPSLSpock Class
 * @author rdoult
 * @version 1.0
 **/
public class RPSLSpock {
    static Random rand = new Random(System.currentTimeMillis());



    public static final String ROCK = "rock";
    public static final String PAPER = "paper";
    public static final String SCISSORS = "scissors";
    public static final String LIZARD = "lizard";
    public static final String SPOCK = "spock";

    /**
     * Looks at the string pick to see if equals null if null is not true then returns one of the picks rock, paper, scissors, lizard, spock
     * @param pick  takes String h_pick if not valid if it is valid returns true
     * @return false if invalid returns true returns rock, paper, scissors, lizard, spock
     */
    public static boolean isValidPick(String pick) {
        if (pick == null) {
            return false;
        }

        pick = pick.trim();
        return (ROCK.equalsIgnoreCase(pick) ||
                PAPER.equalsIgnoreCase(pick) ||
                SCISSORS.equalsIgnoreCase(pick) ||
                LIZARD.equalsIgnoreCase(pick) ||
                SPOCK.equalsIgnoreCase(pick));
    }

    /**
     *pick sees if String h_pick if not valid produce null If valid will choose ROCK, PAPER, SCISSORS, LIZARD, SPOCK
     * @return Trim () function returns the omitted string with no leading and trailing spaces. equalsIgnoreCase the case while comparing two strings return h_pick
     * generatePick  the switch statement to select one of 5 code blocks to be executed. return a random case
     **/


    public static String generatePick() {
        String pick = null;
        switch (rand.nextInt(5)) {
            case 0:
                pick = ROCK;
                break;
            case 1:
                pick = PAPER;
                break;
            case 2:
                pick = SCISSORS;
                break;
            case 3:
                pick = LIZARD;
                break;
            case 4:
                pick = SPOCK;
                break;
        }
        return pick;
    }

    /**
     * isComputerWin compares c_pick to h_pick
     * @param c_pick from generatePick
     * @param h_pick from user input
     * @return comparison to human choice
     **/

    public static boolean isComputerWin(String c_pick,String h_pick) {
        h_pick = h_pick.toLowerCase();
        return ((ROCK.equals(c_pick) && (SCISSORS.equals(h_pick) || LIZARD.equals(h_pick))) ||
                (PAPER.equals(c_pick) && (ROCK.equals(h_pick) || SPOCK.equals(h_pick))) ||
                (SCISSORS.equals(c_pick) && (PAPER.equals(h_pick) || LIZARD.equals(h_pick))) ||
                (LIZARD.equals(c_pick) && (PAPER.equals(h_pick) || SPOCK.equals(h_pick))) ||
                (SPOCK.equals(c_pick) && (ROCK.equals(h_pick) || SCISSORS.equals(h_pick))));
    }
}