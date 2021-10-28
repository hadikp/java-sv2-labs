package enumtype.position;

public class PositionMain {
    public static void main(String[] args) {
        Position pos = Position.TAKARÍTÓNŐ;
        System.out.println(pos.name() + ": Fizetése: " + pos.getSalary() + "Ft Béren kívüli juttatás: " + pos.getBenefit());
        System.out.println(Position.TITKÁRNŐ.name() + ": Fizetése: " + Position.TITKÁRNŐ.getSalary() + "Ft Béren kívüli juttatás: " + Position.TITKÁRNŐ.getBenefit());
        System.out.println(Position.IGAZGATÓ.name() + ": Fizetése: " + Position.IGAZGATÓ.getSalary() + "Ft Béren kívüli juttatás: " + Position.IGAZGATÓ.getBenefit());
    }
}
