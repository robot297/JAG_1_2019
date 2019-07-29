package week_1;

import static input.InputUtils.doubleInput;
import static input.InputUtils.yesNoInput;

/**
 * USPS charges 49c to mail a standard, rectangular letter.

 USPS charges an extra 21c to mail a non-machinable letter,
 the type of letter that can't be processed by their mail-sorting machines.

 Rectangular letters can be processed by machine. Square, circular or other shaped letters can't be processed by machine.
 Letters must be flat to be processed by machine. Letters that are not flat (with bumps or have a curved shape) can't be processed by machine.

 Write a letter mailing price calculating program.

 Ask the user what shape their letter is - rectangular or not
 Ask the user if their letter is flat or not

 Calculate and display the cost to mail the letter.

 */


public class Question_4_Mail_Prices {

    // Some global constants. Use these variables in the calculateStampPrice method
    public final static int machinableLetterPrice = 49;
    public final static int nonMachinableSurcharge = 21;


    public static void main(String[] args) {

        boolean isRectangular = yesNoInput("Is the letter rectangular?");
        boolean isFlat = yesNoInput("Is the letter flat?");

        // Calculate price, in cents
        int price = calculateStampPrice(isRectangular, isFlat);

        System.out.println("Your letter will cost " + price + " cents to mail.");

        // Optional - if preferred, display the price as dollars and cents.

    }


    /* Calculate and return the price, in cents, to mail the letter.  */

    public static int calculateStampPrice(boolean isRectangle, boolean isFlat) {

        /* TODO Calculate and return the price, in cents, to mail the letter.
        * Use the two boolean variables isRectangle and isFlat to figure out the cost.
        * Use the machinableLetterPrice and nonMachinableSurcharge variables declared above.
        */

        //TODO delete this line and replace with your own code
        return 0;   // This is the wrong answer, but Java requires us to return something.

    }
    
  
}



