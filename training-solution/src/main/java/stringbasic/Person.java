package stringbasic;

public class Person {
    private String name;
    private String email;
    private String TAJ;
    private String bankAcc;
    private String telNum;

    public Person(String name, String email, String TAJ, String bankAcc, String telNum) {
        this.name = name;
        this.email = email;
        this.TAJ = TAJ;
        this.bankAcc = bankAcc;
        this.telNum = telNum;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getTAJ() {
        return TAJ;
    }

    public String getBankAcc() {
        return bankAcc;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTAJ(String TAJ) {
        this.TAJ = TAJ;
    }

    public void setBankAcc(String bankAcc) {
        this.bankAcc = bankAcc;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", TAJ='" + TAJ + '\'' +
                ", bankAcc='" + bankAcc + '\'' +
                ", telNum='" + telNum + '\'' +
                '}';
    }
}
