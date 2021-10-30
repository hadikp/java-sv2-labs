package stringbasic;

public class Student {
    private String neptun;
    private String azon;
    private String enterCard;
    private Person person;

    public Student(String neptun, String azon, Person person) {
        this.neptun = neptun;
        this.azon = azon;
        this.person = person;
    }

    public String getNeptun() {
        return neptun;
    }

    public String getAzon() {
        return azon;
    }

    public String getEnterCard() {
        return enterCard;
    }

    public Person getPerson() {
        return person;
    }

    public void setNeptun(String neptun) {
        this.neptun = neptun;
    }

    public void setAzon(String azon) {
        this.azon = azon;
    }

    public void setEnterCard(String enterCard) {
        this.enterCard = enterCard;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Student{" +
                "neptun='" + neptun + '\'' +
                ", azon='" + azon + '\'' +
                ", enterCard='" + enterCard + '\'' +
                ", person=" + person +
                '}';
    }
}
