package main;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz();

        MultipleChoiceQuestion myMultipleChoiceQuestion = new MultipleChoiceQuestion("What sound does a dog make?\nA: Bark\nB: Quack\nPlease just type a single letter as an answer","A");
        myQuiz.addQuestion(myMultipleChoiceQuestion);

        CheckBoxQuestion myCheckBoxQuestion = new CheckBoxQuestion("Select all that apply, which animals can fly?\nA: Penguins\nB: Doves\nC: Owls", "A,B");
        myQuiz.addQuestion(myCheckBoxQuestion);

        TrueFalseQuestion myTrueFalseQuestion = new TrueFalseQuestion("Dogs are omnivores \n True or False?","True");
        myQuiz.addQuestion(myTrueFalseQuestion);

        myQuiz.runQuiz();

    }
}
