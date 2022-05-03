package main;

public class CheckBoxQuestion extends Question{
    public CheckBoxQuestion(String question, String answer) {
        super(question,answer);
    }
    @Override
    public boolean checkAnswer(String answer) {
        String actualAnswer = this.getTheAnswer();
        if(answer.toUpperCase().equals(actualAnswer.toUpperCase())){
            return true;
        } else {
            return false;
        }
    }
}
