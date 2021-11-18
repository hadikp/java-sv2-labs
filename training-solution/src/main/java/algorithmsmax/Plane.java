package algorithmsmax;

public class Plane {

    private int counterMax;

    public void getLongestOcean(String map) {
        int counter = 0;

        String[] mapSplit = map.split("");
        for (String st: mapSplit) {
            if (st.equals("0")) {
                counter++;
            } else {
                counterMaxExam(counter); //Maximum találat vizsgálata
                counter = 0;
            }
        }
        System.out.println("A leghosszabb óceán szakasz hossza: " + counterMax);
    }

    private void counterMaxExam(int counter) {
        if (counterMax < counter) {
            counterMax = counter;
        }
    }

    public static void main(String[] args) {
        Plane plane = new Plane();
        String map = "10000000111110000000000001111111111000010000010000100000111111110000101000000000111110000000000000000100000001000000000000111111000000000100000000000011";
        plane.getLongestOcean(map);
    }
}
