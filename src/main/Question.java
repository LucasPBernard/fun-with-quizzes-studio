package main;

public abstract class Question {

    private final String theQuestion;
    private final String theAnswer;

    public Question(String question, String answer) {
        this.theQuestion = question;
        this.theAnswer = answer;
    }

    public String getTheQuestion() {
        return theQuestion;
    }

    public String getTheAnswer() {
        return theAnswer;
    }

    public abstract boolean checkAnswer(String answer);
}
