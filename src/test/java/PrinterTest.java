import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    @Test
    public void printerCheck(){
        Printer printer = new Printer(6, 15);
        assertEquals(0, printer.Print(1, 6));
    }

    @Test
    public void addingPaper(){
        Printer printer = new Printer(5, 15);
        assertEquals(11 , printer.Print(1, 6));
    }

    @Test
    public void tonerCheck(){
        Printer printer = new Printer(6, 15);
        printer.Print(1, 6);
        assertEquals(9, printer.getToner());
    }




}
