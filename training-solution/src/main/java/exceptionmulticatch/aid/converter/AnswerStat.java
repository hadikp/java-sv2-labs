package exceptionmulticatch.aid.converter;

public class AnswerStat {

    private BinaryStringConverter bsk;

    public AnswerStat(BinaryStringConverter data) {
        this.bsk = data;
    }

    public boolean[] convert(String input) {
        try {
            return bsk.binaryStringToBooleanArray(input);
        }
        catch (NullPointerException | IllegalArgumentException iae) {
            throw new InvalidBinaryStringException(iae);
        }
    }

    public int answerTruePercent(String answers) {
        int count = 0;
        boolean[] arr = convert(answers);
        for (boolean b: arr) {
            if (b == true) {
                count++;
            }
        }
        //System.out.println(answers.length());
        int result = (int) (100 * (1.0 * count / answers.length()));
        return result;
    }
}
