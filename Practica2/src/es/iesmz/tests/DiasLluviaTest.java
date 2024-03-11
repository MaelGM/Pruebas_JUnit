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
        assertEquals(false, calendario.registroDia(30,2, true));
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
        calendario.registroDia(29,2, false);
        calendario.registroDia(15,2, true);
        calendario.registroDia(-5,2, true);
        calendario.registroDia(30,2, true);
        assertEquals(1, calendario.contarDiasLluviosos());
    }
}
