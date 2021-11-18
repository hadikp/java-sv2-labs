package algorithmsmax.sales;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesTest {

    Sales sales = new Sales();
    List<SalesPerson> salesList;

    @BeforeEach
    void init () {
        salesList = Arrays.asList(new SalesPerson("Péter", 1_534_555, 622_111),
                new SalesPerson("János", 534_555, 1_222_111),
                new SalesPerson("Gyöngyi", 734_555, 822_111),
                new SalesPerson("András", 334_555, 222_111));
    }

    @Test
    void testMaxSalesPerson () {
        assertEquals("Péter", sales.selectSalesPersonWithMaxSalesAmount(salesList).getName());
    }

    @Test
    void testTargetMax () {
        assertEquals("Péter", sales.selectSalesPersonWithFurthestAboveTarget(salesList).getName());
    }

    @Test
    void testMinusAmountTarget () {
        assertEquals("János", sales.selectSalesPersonWithFurthestBelowTarget(salesList).getName());
    }

}