package CarteraTest;

public class Cuenta {
    private double saldo;

    public Cuenta() {
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresar(double cantidad) {
        if (saldo + cantidad > 0 && cantidad <= 6000) this.saldo += cantidad;
    }

    public void retirar(double i) {
        if (saldo - i > 0 && i > 0 && i <= 6000) this.saldo -= i;
    }

    public void transferir(Cuenta c, double dinero) {
        if (dinero > 0 && dinero <= 3000){
            c.ingresar(dinero);
            retirar(dinero);
        }
    }
}
