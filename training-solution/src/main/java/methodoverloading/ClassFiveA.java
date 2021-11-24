package methodoverloading;

import java.util.ArrayList;
import java.util.List;

public class ClassFiveA {

    private List<String> nameList = new ArrayList<>();

    public ClassFiveA(List<String> nameList) {
        this.nameList = nameList;
    }

    public String getTodayReferringStudent(int number) {
        return nameList.get(number - 1);
    }

    public String  getTodayReferringStudent(Number number) {
        int num = number.getValue();
        return nameList.get(num - 1);
    }

    public String getTodayReferringStudent(String numberName) {
       int num = Number.valueOf(numberName.toUpperCase()).getValue();
       return nameList.get(num - 1);
    }

    public List<String> getNameList() {
        return nameList;
    }
}
