package collectionsclass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExamTest {

    ExamResult peter;
    ExamResult eniko;
    ExamResult janos;
    ExamResult sara;
    Exam exam;

    @BeforeEach
    void init() {
        peter = new ExamResult("Péter", 100);
        eniko = new ExamResult("Enikő", 95);
        sara = new ExamResult("Sára", 110);
        janos = new ExamResult("János", 55);
        List<ExamResult> examResultList = new ArrayList<>(Arrays.asList(peter, eniko, sara, janos));
        exam = new Exam(examResultList);
    }

    @Test
    void test() {
        System.out.println(exam.getNamesOfSucceededPeople(3));
        System.out.println(exam.getExamResultList());
    }



}