package methodvarargs.examstats;

public class ExamStats {

    private int maxPoints;

    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results) { //küszöbérték százalék, vizsgaeredmények-pontok

        if (results == null || results.length == 0) {
                throw new IllegalArgumentException("Töltsd ki a második paramétert is!");
        }
        int counter = 0;
        for (int r: results) {
            if (r > limitInPercent) {
                counter++;
            }
        }
        return counter;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results) {
        for (int r: results) {
            if (r < limitInPercent) {
                return true;
            }
    }
        return false;
    }

}
