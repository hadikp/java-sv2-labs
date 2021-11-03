package controliteration.fibonacci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        List<Integer> fibonacciList = new ArrayList<>(Arrays.asList(0, 1));
        int f1;
        int f2;
        for (int i = 0; i < 10; i++) {
            f1 = fibonacciList.get(i);
            f2 = fibonacciList.get(i+1);
            fibonacciList.add(f1 + f2);
        }
        for (int f: fibonacciList) {
            System.out.println(f);
        }
    }
}
