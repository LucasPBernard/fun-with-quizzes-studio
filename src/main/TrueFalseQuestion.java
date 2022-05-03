package main;

import java.util.Locale;

public class TrueFalseQuestion extends Question {
    public TrueFalseQuestion(String question, String answer) {
        super(question,answer);
    }
    @Override
    public boolean checkAnswer(String answer) {
        String actualAnswer = this.getTheAnswer();
        if (answer.toUpperCase().equals(this.getTheAnswer().toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }
}
