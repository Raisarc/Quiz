/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author raisa
 */
public class MultipleChoiceQuestion extends Question {
    
    private String[] questions;
    private String[] answers;
    private int correctAnswer;
    
    public MultipleChoiceQuestion(String question, String[] answers, int correctAnswer, int score){
        
    }
    
    public MultipleChoiceQuestion(String question, String[] answers, int correctAnswer){
        
    }
    /**
     * Prints each answer with the option item to be chosen in front
     * @return 
     */
    @Override
    public String toString() {
        char item = 'A';
        int value = Character.getNumericValue(item);
        String text = "";
        for (int i=0; i<answers.length; i++){
            text = String.valueOf(item) + ") " + answers[0] + "\n";
            item = (char)value++;
        }
        return text;
    }

    @Override
    public boolean isCorrect(String answer) {
        
    }

    @Override
    public String correctAnswer() {
        return "The correct answer is:\n"+answers[correctAnswer];
    }
}
