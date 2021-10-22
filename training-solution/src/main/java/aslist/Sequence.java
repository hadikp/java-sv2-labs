package aslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sequence {
    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>(Arrays.asList(1, 2));
        for (int i = 2; i < 9; i++) {
            elements.add(elements.get(i-2) * elements.get(i-1));
        }

        System.out.println("A lista mérete: " + elements.size());
        System.out.print("A lista tartalma: ");
        for (int elem: elements) {
            System.out.print(elem + " ");
        }
    }
}
