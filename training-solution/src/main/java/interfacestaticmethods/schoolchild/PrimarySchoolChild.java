package interfacestaticmethods.schoolchild;

public interface PrimarySchoolChild {

    static PrimarySchoolChild of(int age) {
        PrimarySchoolChild primarySchoolChild = null;
        if (age >= 6 && age <= 10) {
            primarySchoolChild = new LowerClassSchoolChild(age);
        }
        if (age >= 11 && age <= 14) {
                primarySchoolChild = new UpperClassSchoolChild(age);
        }
        if (primarySchoolChild == null){
                new IllegalArgumentException("A kor nem megfelelő!");
            }
       return primarySchoolChild;
    }
}
