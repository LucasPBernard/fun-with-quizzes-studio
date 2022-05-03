package main;

public class MultipleChoiceQuestion extends Question {
    public MultipleChoiceQuestion(String question, String answer) {
        super(question, answer);
    }

    @Override
    public boolean checkAnswer(String answer) {
        String actualAnswer = this.getTheAnswer();
        if (answer.toUpperCase().equals(actualAnswer.toUpperCase())) {
            return true;
        }
        return false;
    }
}
