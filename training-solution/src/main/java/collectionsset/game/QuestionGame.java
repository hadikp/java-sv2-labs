package collectionsset.game;

import java.util.*;

public class QuestionGame {

    private List<RightAnswer> answers = new ArrayList<>(); //helyes megfejtések

    public QuestionGame(List<RightAnswer> answers) {
        this.answers = answers;
    }

    public Set<String> drawWinners() {
        Random rnd = new Random();
        Set<String> result = new HashSet<>();
        while (result.size() != 5) {
            if (answers.size() == 0) {
                throw new IllegalArgumentException("Nem érkezett elég megfejtés!");
            }
            int numberWinner = rnd.nextInt(answers.size());
            result.add(answers.get(numberWinner).getName());
            if (answers.contains(answers.get(numberWinner))) {
                answers.remove(numberWinner);
            }
        }
        return result;
    }

    public List<RightAnswer> getAnswers() {
        return new ArrayList<>(answers);
    }
}
