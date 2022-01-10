package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exam {

    private List<ExamResult> examResultList;

    public Exam(List<ExamResult> examResultList) {
        this.examResultList = examResultList;
    }

    public List<String> getNamesOfSucceededPeople(int places) { //felvételt nyertek listája
        List<ExamResult> result = new ArrayList(examResultList);
        Collections.sort(result);
        Collections.reverse(result);
        List<ExamResult> del = new ArrayList<>();
        for (int i = places; i < result.size(); i++) {
            del.add(result.get(i));
        }
        result.removeAll(del);
        List<String> resultString = new ArrayList<>();
        for (ExamResult er: result) {
            resultString.add(er.getName());
        }
        return resultString;
    }

    public List<ExamResult> getExamResultList() {
        return new ArrayList<>(examResultList);
    }
}
