package week_1;

import org.junit.Test;

import static org.junit.Assert.*;
import static week_1.Question_2_Quiz_Question.checkAnswer;

/**
 * Created by clara on 1/4/18.
 */
public class Question_2_QuizQuestion_Test {
    
    @Test(timeout=3000)
    public void testQuizChecker() {
        
        String msg = "Return true if the answer is \"Bill Gates\" in any letter case.  " +
                "\nIf the answer is anything else, return false. " +
                "\nIn this test, the checkAnswer() method was called with the String \"%s\" and was expected to return %b, but it returned %b";
        
        String[] correctAnswers = { "Bill Gates", "BILL Gates", "bill gates", "bIlL gAtEs"};
        
        String[] incorrectAnswers = { "Bill  Gates", "Linus Torvalds", "Steve Wozniak", "wsfdgdgwersve"};
        
        for (String answer : correctAnswers) {
            assertTrue(String.format(msg, answer, true, false), checkAnswer(answer));
        }
        
        for (String answer : incorrectAnswers) {
            assertFalse(String.format(msg, answer, false, true), checkAnswer(answer));
        }
        
    }
    
}
