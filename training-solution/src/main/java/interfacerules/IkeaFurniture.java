package interfacerules;

public class IkeaFurniture implements Name, Length, Width {

    private String name;
    private double length;
    private double with;

    public IkeaFurniture(String name, double length, double with) {
        this.name = name;
        this.length = length;
        this.with = with;
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getWidth() {
        return with;
    }
}
