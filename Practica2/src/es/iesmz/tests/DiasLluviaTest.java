package es.iesmz.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class DiasLluviaTest {
    @Test
    void registrarDia(){
        DiasLluvia calendario = new DiasLluvia();
        calendario.registroDia(31,5,true);
        assertEquals(true, calendario.consultarDia(31,5));
    }

    @Test
    void registrarDiaFebrero(){
        DiasLluvia calendario = new DiasLluvia();
        assertNotEquals(true, calendario.registroDia(30,2, true));
    }

    @Test
    void registrarDiasLluviosos(){
        DiasLluvia calendario = new DiasLluvia();
        calendario.registroDia(7,2, true);
        calendario.registroDia(9,5, true);
        calendario.registroDia(2,13, true);
        calendario.registroDia(30,2, true);
        assertEquals(2, calendario.contarDiasLluviosos());
    }

    @Test
    void registrarDiasLluviososFebrero(){
        DiasLluvia calendario = new DiasLluvia();
        calendario.registroDia(30,2, true);
        calendario.registroDia(15,2, true);
        calendario.registroDia(-5,2, true);
        calendario.registroDia(30,2, true);
        assertNotEquals(2, calendario.contarDiasLluviosos());
    }

    @Test
    void trimestreMasLluviosoError(){
        DiasLluvia calendario = new DiasLluvia();
        calendario.registroDia(28,1, true);
        calendario.registroDia(15,2, true);

        calendario.registroDia(28,4, true);
        calendario.registroDia(15,5, true);
        calendario.registroDia(5,6, true);

        calendario.registroDia(28,7, true);

        calendario.registroDia(28,10, true);
        calendario.registroDia(15,11, true);
        assertNotEquals(4, calendario.trimestreLluvioso());
    }

    @Test
    void trimestreMasLluvioso(){
        DiasLluvia calendario = new DiasLluvia();
        calendario.registroDia(28,1, true);
        calendario.registroDia(15,2, true);
        calendario.registroDia(5,3, true);

        calendario.registroDia(28,4, true);
        calendario.registroDia(15,5, true);

        calendario.registroDia(28,7, true);

        calendario.registroDia(28,10, true);
        calendario.registroDia(15,11, true);
        assertEquals(1, calendario.trimestreLluvioso());
    }

    @Test
    void primerDiaLluvioso(){
        DiasLluvia calendario = new DiasLluvia();
        calendario.registroDia(28,5, true);
        calendario.registroDia(15,9, true);
        calendario.registroDia(32,1, true);
        calendario.registroDia(5,1, true);
        assertEquals(5, calendario.primerDiaLluvia());
    }

    @Test
    void primerDiaLluviosoError(){
        DiasLluvia calendario = new DiasLluvia();
        calendario.registroDia(28,2, true);
        calendario.registroDia(15,9, true);
        calendario.registroDia(32,1, true);
        calendario.registroDia(15,1, false);
        assertNotEquals(15, calendario.primerDiaLluvia());
    }
}
