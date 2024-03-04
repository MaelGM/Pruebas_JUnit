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

    @Test
    void testCalculaSalarioBruto1(){
        assertEquals(1360, EmpleadoBR.calculaSalarioBruto(TipoEmpleado.venedor, 2000, 8));
    }
    @Test
    void testCalculaSalarioBruto2(){
        assertEquals(1260, EmpleadoBR.calculaSalarioBruto(TipoEmpleado.venedor, 1500, 3));
    }
    @Test
    void testCalculaSalarioBruto3(){
        assertEquals(1100, EmpleadoBR.calculaSalarioBruto(TipoEmpleado.venedor, 1499.99f, 0));
    }
    @Test
    void testCalculaSalarioBruto4(){
        assertEquals(1760, EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encarregat, 1250, 8));
    }
    @Test
    void testCalculaSalarioBruto5(){
        assertEquals(1600, EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encarregat, 1000, 0));
    }

    @Test
    void testCalculaSalarioBruto6(){
        assertEquals(1560, EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encarregat, 999.99f, 3));
    }

    @Test
    void testCalculaSalarioBruto7(){
        assertEquals(1500, EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encarregat, 500, 0));
    }

    @Test
    void testCalculaSalarioBruto8(){
        assertEquals(1660, EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encarregat, 0, 8));
    }

    @Test
    void testCalculaSalarioBruto9(){
        assertEquals(-1, EmpleadoBR.calculaSalarioBruto(TipoEmpleado.venedor, -1, 8));
    }

    @Test
    void testCalculaSalarioBruto10(){
        assertEquals(-1, EmpleadoBR.calculaSalarioBruto(TipoEmpleado.venedor, 1500, -1));
    }

    @Test
    void testCalculaSalarioBruto11(){
        assertEquals(-1, EmpleadoBR.calculaSalarioBruto(null, 1500, 8));
    }

}
