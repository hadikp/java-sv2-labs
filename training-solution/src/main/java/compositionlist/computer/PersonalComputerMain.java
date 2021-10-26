package compositionlist.computer;

public class PersonalComputerMain {
    public static void main(String[] args) {
        Cpu cpu = new Cpu("Core-i5", 3.7);
        PersonalComputer personalComputer = new PersonalComputer(cpu);
        Hardware hardware = new Hardware("winchester", "SSD");
        personalComputer.addHardware(hardware);
        Software software = new Software("windows", 11);
        personalComputer.addSoftware(software);
        System.out.println(personalComputer);
    }
}
