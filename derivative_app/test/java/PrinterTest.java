import main.Tester;

import static org.junit.jupiter.api.Assertions.*;
class PrinterTest {

    @org.junit.jupiter.api.Test
    void testOne() {
        Tester tester = new Tester();
        assertEquals(tester.print(3),3);
    }

    @org.junit.jupiter.api.Test
    void testTwo() {
        Tester tester = new Tester();
        assertEquals(tester.print(3),5);
    }
}