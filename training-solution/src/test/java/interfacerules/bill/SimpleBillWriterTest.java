package interfacerules.bill;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SimpleBillWriterTest {

    Path path;
    Bill bill;

    @BeforeEach
    void init() {
        path = Path.of("src/test/resources/billitems.txt");
        bill = new Bill();
    }

    @Test
    void testWriteBill() {
        SimpleBillWriter sw = new SimpleBillWriter();
        List<String> files = bill.readBillItemsFromFile(path);
        System.out.println(sw.writeBill(files));
    }

    @Test
    void testComplexWriteBill() {
        ComplexBillWriter cbw = new ComplexBillWriter();
        List<String> files = bill.readBillItemsFromFile(path);
        System.out.println(cbw.writeBill(files));
    }

}