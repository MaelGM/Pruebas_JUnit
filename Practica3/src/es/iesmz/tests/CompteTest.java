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
    void generaIBAN_1(){
        Compte c = new Compte();
        assertEquals("ES7100302053091234567895", c.generaIBAN("0030","2053","09","1234567895"));
    }
    @Test
    void generaIBAN_1(){
        Compte c = new Compte();
        assertEquals("ES7100302053091234567895", c.generaIBAN("0030","2053","09","1234567895"));
    }
    @Test
    void generaIBAN_1(){
        Compte c = new Compte();
        assertEquals("ES7100302053091234567895", c.generaIBAN("0030","2053","09","1234567895"));
    }
    @Test
    void generaIBAN_1(){
        Compte c = new Compte();
        assertEquals("ES7100302053091234567895", c.generaIBAN("0030","2053","09","1234567895"));
    }
    @Test
    void generaIBAN_1(){
        Compte c = new Compte();
        assertEquals("ES7100302053091234567895", c.generaIBAN("0030","2053","09","1234567895"));
    }

}