package algorithmsmax.trainer;

import java.util.List;

public class MaxAgeCalculator {

    public Trainer getTrainerWithMaxAge(List<Trainer> trainers) {
        Trainer trainerMaxAge = trainers.get(0);
        for (Trainer t: trainers) {
            if (t.getAge() > trainerMaxAge.getAge()) {
                trainerMaxAge = t;
            }
        }
       return trainerMaxAge;
    }

    public static void main(String[] args) {
        MaxAgeCalculator max = new MaxAgeCalculator();
        Trainer trainer1 = new Trainer("Péter", 55);
    }
}
