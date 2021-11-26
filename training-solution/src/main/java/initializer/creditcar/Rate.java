package initializer.creditcar;

public class Rate {

    private Currency currency;
    private double conversionFactor;


    public double valutaRate(double valuta, Currency currency) { //kiadás
         double forint = valuta * currency.getAmount();
         return forint;
    }

    public Currency getCurrency() {
        return currency;
    }

}
