package lambdaoptional.club;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Club {

    private List<Member> members;

    public Club(List<Member> members) {
        this.members = members;
    }

    public Optional<Member> findFirst(Predicate<Member> predicate) {
        for (Member m: members) {
            if (predicate.test(m)) {
                return Optional.of(m);
            }
        }
        return Optional.empty();
    }

    public Optional<Double> averageNumberOfSkills() {
        int sum = 0;
        if (members.size() == 0) {
            return Optional.empty();
        }
        for (Member m: members) {
            sum += m.getSkills().size();
        }
        return Optional.of((double) sum / members.size());
    }
}
