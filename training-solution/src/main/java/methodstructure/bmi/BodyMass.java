package methodstructure.bmi;

public class BodyMass {

    private double weight;
    private double height;

    public BodyMass(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public BmiCategory  getBody() {
        double bmi = getBodyMassIndex();
        if (bmi < 18.5) {
            return BmiCategory.UNDERWEIGHT;
        } else if (bmi > 25) {
            return BmiCategory.OVERWEIGHT;
        }
        return BmiCategory.NORMAL;
    }

    public double getBodyMassIndex() {
        return weight / (height * height);
    }

    public boolean isThinnerThan(BodyMass other) {
        if (this.getBodyMassIndex() < other.getBodyMassIndex()) {
            return true;
        }
        return false;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public static void main(String[] args) {
        BodyMass bodyMass = new BodyMass(77, 1.7);
        System.out.println(bodyMass.getBodyMassIndex());

        System.out.println(bodyMass.getBody());



    }
}
