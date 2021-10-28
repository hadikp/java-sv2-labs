package enumtype.university;

public class UniversityMain {
    public static void main(String[] args) {
        University uni = University.BME;
        System.out.println(uni.name() + ": " +  uni.getName());
        System.out.println(University.PE.name() + ": " +  University.PE.getName());
        System.out.println(University.ME.name() + ": " +  University.ME.getName());
    }
}
