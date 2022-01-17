package lambdaoptional.club;

import java.util.List;

public class Member {

    private String name;
    private List<String> skills;

    public Member(String name, List<String> skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public List<String> getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return name + ", skills=" + skills;
    }
}
