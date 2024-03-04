package CarteraTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarteraTest {
    @Test
    void testAlCrearCuentaElSaldoEsCero(){
        Cuenta c = new Cuenta();
        assertEquals(0,c.getSaldo());
    }

    @Test
    void testIngreso100ACuentaVacia(){
        Cuenta c = new Cuenta();
        c.ingresar(100);
        assertEquals(100, c.getSaldo());
    }

    @Test
    void testIngreso3000ACuentaVacia(){
        Cuenta c = new Cuenta();
        c.ingresar(3000);
        assertEquals(3000, c.getSaldo());
    }

    @Test
    void testIngreso3000ACuentaConSaldoDe100(){
        Cuenta c = new Cuenta();
        c.ingresar(100);
        c.ingresar(3000);
        assertEquals(3100, c.getSaldo());
    }

    @Test
    void testIngresoNegativoACuentaNoVacia(){
        Cuenta c = new Cuenta();
        c.ingresar(-100);
        assertEquals(0, c.getSaldo());
    }

    @Test
    void testIngresoDeMaximo2Decimales(){
        Cuenta c = new Cuenta();
        c.ingresar(100.45);
        assertEquals(100.45, c.getSaldo());
    }

    @Test
    void testIngresoSobrepasaElMaximo(){
        Cuenta c = new Cuenta();
        c.ingresar(6000.01);
        assertEquals(0,c.getSaldo());
    }

    @Test
    void testRetirarDineroDeCuentaCon500(){
        Cuenta c = new Cuenta();
        c.ingresar(500);
        c.retirar(100);
        assertEquals(400,c.getSaldo());
    }

    @Test
    void testRetirarMasDineroQueSaldoDisponible(){
        Cuenta c = new Cuenta();
        c.ingresar(200);
        c.retirar(500);
        assertEquals(200,c.getSaldo());
    }

    @Test
    void testRetirarDineroNegativo(){
        Cuenta c = new Cuenta();
        c.ingresar(500);
        c.retirar(-100);
        assertEquals(500,c.getSaldo());
    }

    @Test
    void testRetirarDineroDecimal(){
        Cuenta c = new Cuenta();
        c.ingresar(500);
        c.retirar(100.45);
        assertEquals(399.55,c.getSaldo());
    }

    @Test
    void testRetirarMasQueElDineroMaximo(){
        Cuenta c = new Cuenta();
        c.ingresar(6000);
        c.ingresar(1000);
        c.retirar(6000.01);
        assertEquals(7000,c.getSaldo());
    }


    @Test
    void testTransferencia(){
        Cuenta c1 = new Cuenta();
        Cuenta c2 = new Cuenta();
        c1.ingresar(500);
        c2.ingresar(50);

        c1.transferir(c2, 100);

        assertEquals(400,c1.getSaldo());
        assertEquals(150,c2.getSaldo());
    }

    @Test
    void testTransferenciaNegativa(){
        Cuenta c1 = new Cuenta();
        Cuenta c2 = new Cuenta();
        c1.ingresar(500);
        c2.ingresar(50);

        c1.transferir(c2, -100);

        assertEquals(500,c1.getSaldo());
        assertEquals(50,c2.getSaldo());
    }

    @Test
    void testTransferirMasQueElMaximo(){
        Cuenta c1 = new Cuenta();
        Cuenta c2 = new Cuenta();
        c1.ingresar(3500);
        c2.ingresar(50);

        c1.transferir(c2, 3000.01);

        assertEquals(3500,c1.getSaldo());
        assertEquals(50,c2.getSaldo());
    }

}