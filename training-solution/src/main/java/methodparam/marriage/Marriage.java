package methodparam.marriage;

import java.time.LocalDate;

public class Marriage {

    public void getMarried(Woman woman, Man man) {
        RegisterDate weddingData = todayWedding(); //1.segédfüggvény, mai dátum a házasságkötés ideje

        woman.getRegisterDatesListW().add(weddingData);
        man.getRegisterDatesListM().add(weddingData);

    }

    private RegisterDate todayWedding() {
        LocalDate now = LocalDate.now();
        return new RegisterDate("házasságkötés ideje", now);
    }

}
