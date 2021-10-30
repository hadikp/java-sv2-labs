package stringbasic;

public class UniversityMain {
    public static void main(String[] args) {
        Person person = new Person("Péter", "hadikp@freemail.hu", "211 322 211", "1111111_3333333", "0620 324 455");
        Student student = new Student("neptunAzon", "oktatási azonosító", person);
        Student anotherStudent = new Student("neptunAzon2", "oktatási azonosító", person);
        University uni = new University();
        uni.addStudent(student);
        uni.addStudent(anotherStudent);

        System.out.println(uni.getStudentsList());
        System.out.println("A két hallgató ugyanaz? " + uni.areEqual(student, anotherStudent));
    }
}
