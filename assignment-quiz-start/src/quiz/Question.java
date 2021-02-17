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
public abstract class Question {    
    private int score;
    
    public void setScore(){
        
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return "";
    }
    
    public boolean isCorrect(String answer){
        return true;
    }
    
    public String correctAnswer(){
        return "";
    }
    
}
