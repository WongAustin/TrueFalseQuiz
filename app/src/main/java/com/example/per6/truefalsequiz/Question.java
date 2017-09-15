package com.example.per6.truefalsequiz;

import java.util.ArrayList;

/**
 * Created by per6 on 9/15/17.
 */

public class Question {
    private String questionText;
    private boolean answer;
    
    private void initQuestionBank() {
        questionBank = new ArrayList<>();
    }
    private void setListeners(){

    }
    public getquestionText(){
        return questionText;
    }

    public Question(String questionText) {

        this.questionText = questionText;
    }

    public Question(boolean answer) {
        this.answer = answer;
    }
    public boolean cheackAnswer(boolean userAnswer) {
        return answer = userAnswer;
    }
}
