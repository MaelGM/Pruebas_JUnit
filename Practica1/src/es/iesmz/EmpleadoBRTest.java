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
    @Test
    void testCalculaSalarioNeto4(){
        assertEquals(1050,EmpleadoBR.calculaSalarioNeto(1250));
    }
    @Test
    void testCalculaSalarioNeto5(){
        assertEquals(840,EmpleadoBR.calculaSalarioNeto(1000));
    }
    @Test
    void testCalculaSalarioNeto6(){
        assertEquals(999.99f,EmpleadoBR.calculaSalarioNeto(999.99f));
    }
    @Test
    void testCalculaSalarioNeto7(){
        assertEquals(500,EmpleadoBR.calculaSalarioNeto(500));
    }
    @Test
    void testCalculaSalarioNeto8(){
        assertEquals(0,EmpleadoBR.calculaSalarioNeto(0));
    }
    @Test
    void testCalculaSalarioNeto9(){
        assertEquals(-1,EmpleadoBR.calculaSalarioNeto(-1));
    }
}
