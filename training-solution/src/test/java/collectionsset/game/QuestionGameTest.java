package collectionsset.game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QuestionGameTest {

    List<RightAnswer> answers;
    QuestionGame qGame;
    RightAnswer peter;
    RightAnswer janos;

    @BeforeEach
    void init() {
        peter = new RightAnswer("Péter");
        janos = new RightAnswer("János");
        RightAnswer eniko = new RightAnswer("Enikő");
        RightAnswer lujza = new RightAnswer("Lujza");
        RightAnswer peter2 = new RightAnswer("Péter");
        RightAnswer andris = new RightAnswer("András");
        RightAnswer botond = new RightAnswer("Botond");
        answers = new ArrayList<>(Arrays.asList(peter, janos, eniko, lujza, peter2, andris, botond));
        qGame = new QuestionGame(answers);
    }

    @Test
    void testInit() {
        assertEquals(7, qGame.getAnswers().size());
        assertEquals("Péter", qGame.getAnswers().get(0).getName());
        assertEquals("Lujza", qGame.getAnswers().get(3).getName());
    }

    @Test
    void testDrawWinners() {
       assertEquals(5, qGame.drawWinners().size());
    }

    @Test
    void testNotEnoughWinner() {
        List<RightAnswer> answersNotEnough = new ArrayList<>(Arrays.asList(peter, janos));
        qGame = new QuestionGame(answersNotEnough);
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> qGame.drawWinners());
        assertEquals("Nem érkezett elég megfejtés!", iae.getMessage());
    }

}