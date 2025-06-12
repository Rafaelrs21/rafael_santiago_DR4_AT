import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import q1.q1;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class q1Test {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalOut);
    }

    @org.junit.Test

    @Test
    public void testClassificarAlto() {
        q1 obj = new q1();
        obj.classificar(11);
        String output = outputStream.toString();
        assertTrue(output.contains("ALTO"));
    }

    @Test
    public void testClassificarMedio() {
        q1 obj = new q1();
        obj.classificar(10);
        String output = outputStream.toString();
        assertTrue(output.contains("MÉDIO"));
    }

    @Test
    public void testClassificarCasoRaro() {
        q1 obj = new q1();
        obj.classificar(-9999);
        String output = outputStream.toString();
        assertTrue(output.contains("CASO RARO"));
    }

    @Test
    public void testClassificarBaixo() {
        q1 obj = new q1();
        obj.classificar(5);
        String output = outputStream.toString();
        assertTrue(output.contains("BAIXO"));
        assertTrue(output.contains("DEBUG: item = 5"));
    }
}