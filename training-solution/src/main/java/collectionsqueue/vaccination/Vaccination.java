package collectionsqueue.vaccination;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Vaccination {

    public Queue<Integer> getVaccinationOrder(List<Person> people) {
        Queue<Integer> result = new PriorityQueue<>();
        for (Person p: people) {
            if (p.getAge() >= 18 && p.getAge() <= 65) {
                result.add(p.getAge());
            }
        }
        return result;
    }
}
