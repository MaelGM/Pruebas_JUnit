package es.iesmz.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompteTest {
    @Test
    void compruebaIBAN_1(){
        Compte c = new Compte();
        assertEquals(true, c.compruebaIBAN("ES6621000418401234567891"));
    }
    @Test
    void compruebaIBAN_2(){
        Compte c = new Compte();
        assertEquals(true, c.compruebaIBAN("ES6000491500051234567892"));
    }
    @Test
    void compruebaIBAN_3(){
        Compte c = new Compte();
        assertEquals(true, c.compruebaIBAN("ES9420805801101234567891"));
    }
    @Test
    void compruebaIBAN_4(){
        Compte c = new Compte();
        assertEquals(false, c.compruebaIBAN("ES7600246912501234567891"));
    }
    @Test
    void compruebaIBAN_5(){
        Compte c = new Compte();
        assertEquals(false, c.compruebaIBAN("ES4721000418401234567891"));
    }
    @Test
    void compruebaIBAN_6(){
        Compte c = new Compte();
        assertEquals(false, c.compruebaIBAN("ES8200491500051234567892"));
    }


    @Test
    void generaIBAN_1(){
        Compte c = new Compte();
        assertEquals("ES7100302053091234567895", c.generaIBAN("0030","2053","09","1234567895"));
    }
    @Test
    void generaIBAN_2(){
        Compte c = new Compte();
        assertEquals("ES1000492352082414205416", c.generaIBAN("0049","2352","08","2414205416"));
    }
    @Test
    void generaIBAN_3(){
        Compte c = new Compte();
        assertEquals("ES1720852066623456789011", c.generaIBAN("2085","2066","62","3456789011"));
    }
    @Test
    void generaIBAN_4(){
        Compte c = new Compte();
        assertEquals(null, c.generaIBAN("2085","2066","62","3456AE9011"));
    }
    @Test
    void generaIBAN_5(){
        Compte c = new Compte();
        assertEquals(null, c.generaIBAN("208","2066","62","3456789011"));
    }
    @Test
    void generaIBAN_6(){
        Compte c = new Compte();
        assertEquals(null, c.generaIBAN("2080","20A6","62","3456789011") );
    }
    @Test
    void generaIBAN_7(){
        Compte c = new Compte();
        assertEquals(null, c.generaIBAN("2080","2086","6","3456789011") );
    }
    @Test
    void generaIBAN_8(){
        Compte c = new Compte();
        assertEquals(null, c.generaIBAN("2080","2086","63","345678911"));
    }
}