package abstractclass.exercise;

public class MathLesson {

    public static void main(String[] args) {
        MathExercise adder = new Adder();
        MathExercise substracter = new Subtracter();
        MathExercise multiplier = new Multiplier();
        MathExercise divisor = new Divisor();

        System.out.println(adder.getSolution(10, 5));
        System.out.println(substracter.getSolution(10, 5));
        System.out.println(multiplier.getSolution(10, 5));
        System.out.println(divisor.getSolution(11, 5));
    }
}
