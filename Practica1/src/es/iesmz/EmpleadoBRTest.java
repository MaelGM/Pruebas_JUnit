package es.iesmz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpleadoBRTest {

    @Test
    void testCalculaSalarioNeto1(){
        assertEquals(1640, EmpleadoBR.calculaSalarioNeto(2000));
    }

    @Test
    void testCalculaSalarioNeto2(){
        assertEquals(1230,EmpleadoBR.calculaSalarioNeto(1500));
    }

    @Test
    void testCalculaSalarioNeto3(){
        assertEquals(1259.9916f,EmpleadoBR.calculaSalarioNeto(1499.99f));
    }
}
