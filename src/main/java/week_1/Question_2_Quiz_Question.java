package week_1;

import static input.InputUtils.stringInput;


/**
 *
 * Finish the method that checks if the answer to the quiz question is correct.
 *
 * You should accept answers in any case, but the spelling and spacing must be correct.
 *
 * (Tip: the answer is Bill Gates.)
 *
 */

public class Question_2_Quiz_Question {
    
    public static void main(String[] args) {
        
        System.out.println("Quiz time!");
        System.out.println("Which technology entrepreneur is supposed to have said \"640K [of RAM] ought to be enough for anyone\" ?");
        String answer = stringInput("Enter your answer: ");
        
        boolean correct = checkAnswer(answer);
        
        if (correct) {
            System.out.println("You are correct!");
        } else {
            System.out.println("Sorry, the answer is Bill Gates.");
        }
        
    }
    
    public static boolean checkAnswer(String answer) {
        
        // TODO check that the user's answer is "Bill Gates" in any letter case.
        // Case doesn't matter, so "bill gates" or "BILL GATES" or any other variation in case is the correct answer.
        // Remember that using == to compare Strings may not do what you expect it to do!
        
        // TODO replace this line with your own code
        return false;
    }
    
}

