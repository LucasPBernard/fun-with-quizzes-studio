package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    ArrayList<Question> questions = new ArrayList<>();
    private int numberOfQuestionsCorrect = 0;
    private Scanner scanner = new Scanner(System.in);
    public Quiz() {

    }

    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    public void runQuiz() {
        for (Question question : questions) {
            System.out.println(question.getTheQuestion());
            String usersAnswer = this.getUsersAnswers();
            boolean userGotQuestionCorrect = question.checkAnswer(usersAnswer);
            if (userGotQuestionCorrect) {
                this.numberOfQuestionsCorrect++;
            }
        }

        double percentageCorrect = ((double) this.numberOfQuestionsCorrect / (double) this.questions.size()) * 100;
        System.out.println("Users Grade: " + percentageCorrect + "%");

    }
    private String getUsersAnswers() {
        String usersAnswer = scanner.nextLine();
        return usersAnswer;
    }
}
