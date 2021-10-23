package looptypesmodify;

public class EveryThird {
    public void changeToZero(int[] numbers) {
        for (int i = numbers.length-1; i > 0 ; i -= 3) {
            numbers[i] = 0;
        }
        for (int nums: numbers) {
            System.out.print(nums + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 6, 3, 5, 7, 2, 6, 2, 3, 5, 7, 3, 2, 9};
        EveryThird numbers = new EveryThird();
        numbers.changeToZero(nums);
    }
}
