package es.iesmz.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiasLluviaTest {
    @Test
    void registrarDia(){
        DiasLluvia calendario = new DiasLluvia();
        calendario.registroDia(1,12,true);
        assertEquals(true, calendario.consultarDia(1,12));
    }
}
