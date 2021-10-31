package stringseparate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IceCream {



    public static void main(String[] args) {
        IceCream iceCream = new IceCream();
        List<String> ice = new ArrayList(Arrays.asList("csoki", "vanília", "eper", "citrom", "puncs"));

        StringBuilder sb = new StringBuilder("Ma kapható: ");
        for (int i = 0; i < ice.size(); i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(ice.get(i));
        }
        sb.append(". Gyerekeknek féláron!");

        System.out.println(sb);
    }
}
