package hexlet.code.games;

import hexlet.code.Engine;

public class EvenGame {
    private static final int MAX_VALUE_OF_NUM = 20;

    public static void startEvenGame() {
        String[][] questionsAndCorrectAnswers =
                new String[Engine.REQUIRED_SCORE_OF_CORRECT_ANSWERS][Engine.PAIR_OF_QUESTION_AND_ANSWER];

        for (int i = 0; i < Engine.REQUIRED_SCORE_OF_CORRECT_ANSWERS; i++) {
            questionsAndCorrectAnswers[i][0] = String.valueOf((int) (Math.random() * MAX_VALUE_OF_NUM) + 1);
            questionsAndCorrectAnswers[i][1] = isEven(questionsAndCorrectAnswers[i][0]) ? "yes" : "no";

        }
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Engine.startEngine(questionsAndCorrectAnswers);
    }

    private static boolean isEven(String questions) {
        return Integer.parseInt(questions) % 2 == 0;
    }
}
