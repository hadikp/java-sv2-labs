package collectionscomp;

import java.util.Objects;

public class Building implements Comparable<Building>  {

    private String address;
    private int area;
    private Integer levels;

    public Building(String address, int area, Integer levels) {
        this.address = address;
        this.area = area;
        this.levels = levels;
    }

    @Override
    public int compareTo(Building other) {
        return levels.compareTo(other.levels);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return levels == building.levels;
    }

    @Override
    public int hashCode() {
        return Objects.hash(levels);
    }

    @Override
    public String toString() {
        return address + ", area: " + area +", levels: " + levels +
                '}';
    }
}
