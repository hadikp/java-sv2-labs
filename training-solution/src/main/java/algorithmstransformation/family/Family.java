package algorithmstransformation.family;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Family {

    private List<FamilyMember> familyMemberList;

    public Family(List<FamilyMember> familyMemberList) {
        this.familyMemberList = familyMemberList;
    }

    public void addFamilyMember(FamilyMember familyMember) {
        familyMemberList.add(familyMember);
    }

    public List<Integer> addFirtsname (String firstname) {
        List<Integer> firstnameAgeList = new ArrayList<>();
        for (FamilyMember fm: familyMemberList) {
           String[] fmSplit = fm.getName().split(" ");
           if (firstname.equals(fmSplit[1])) {
               firstnameAgeList.add(fm.getAge());
           }
        }
        return firstnameAgeList;
    }

    public List<FamilyMember> getFamilyList() {
        return familyMemberList;
    }

}
