package dynamictypes.school;

public class SchoolMain {

    public static void main(String[] args) {
        School school = new School("Iskola", 3);
        School school2 = new PrimarySchool("Primary School", 8);
        School school3 = new SecondarySchool("Secondar School", 4);

        System.out.println(school);
        System.out.println(school2);
        System.out.println(school3);

    }
}
