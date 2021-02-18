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
public class OpenQuestion extends Question{
    
    private String[] questions;
    private String[] answers;
    private int correctAnswer;
    
    public OpenQuestion(String question, String answer, int score){
        
    }
    
    public OpenQuestion(String question, String answer){
        
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isCorrect(String answer) {
        answer = answer.toLowerCase();
        return answer.equalsIgnoreCase(answers[correctAnswer]);
    }

    @Override
    public String correctAnswer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
