/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.util.ArrayList;

/**
 *
 * @author raisa
 */
public abstract class Question {    
    private int score = 3;
    private ArrayList<String> questions;
    
    public void setScore(){
        
    }
    
    /**
     *
     * @return
     */
    @Override
    public abstract String toString();
    
    public abstract boolean isCorrect(String answer);
    
    public abstract String correctAnswer();
    
}
