package lambdaintermediate.cofee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CafeTest {

    Cafe cafe;
    CoffeeOrder peter;
    CoffeeOrder janos;
    CoffeeOrder eniko;
    CoffeeOrder edina;

    @BeforeEach
    void init() {
        Coffee americano = new Coffee(CoffeeType.AMERICANO, 1000);
        Coffee latte = new Coffee(CoffeeType.LATTE, 2000);
        Coffee espresso = new Coffee(CoffeeType.ESPRESSO, 1500);
        Coffee mocha = new Coffee(CoffeeType.MOCHA, 500);
        peter = new CoffeeOrder(Arrays.asList(americano, latte), LocalDate.of(2022, 01, 20));
        janos = new CoffeeOrder(Arrays.asList(espresso, mocha), LocalDate.of(2022, 01, 20));
        edina = new CoffeeOrder(Arrays.asList(americano, mocha), LocalDate.of(2022, 01, 20));
        eniko = new CoffeeOrder(Arrays.asList(americano, latte, mocha), LocalDate.of(2022, 01, 19));
        peter.sumPrice();
        janos.sumPrice();
        edina.sumPrice();
        eniko.sumPrice();
        cafe = new Cafe(Arrays.asList(peter, janos, edina, eniko));
    }

    @Test
    void testCoffeOrderSumPrice() {
        assertEquals(3000, peter.getSumIncome());
        assertEquals(2000, janos.getSumIncome());
        assertEquals(1500, edina.getSumIncome());
        assertEquals(3500, eniko.getSumIncome());
    }

    @Test
    void testSumPrice() {
        assertEquals(10_000, cafe.getTotalIncome());
    }

    @Test
    void testTotalIncomeThisDay() {
        assertEquals(6500, cafe.getTotalIncome(LocalDate.of(2022, 01, 20)));
        assertEquals(3500, cafe.getTotalIncome(LocalDate.of(2022, 01, 19)));
    }

    @Test
    void testGetNumberOfCoffee() {
        assertEquals(2, cafe.getNumberOfCoffee(CoffeeType.LATTE));
        assertEquals(3, cafe.getNumberOfCoffee(CoffeeType.AMERICANO));
    }

    @Test
    void testGgetOrdersAfter() {
        System.out.println(cafe.getOrdersAfter(LocalDate.of(2022, 01, 18)));
    }

    @Test
    void testGetFirstFiveOrder() {
        System.out.println(cafe.getFirstFiveOrder(LocalDate.of(2022,01, 20)));
    }

}