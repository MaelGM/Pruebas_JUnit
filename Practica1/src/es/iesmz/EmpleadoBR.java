package es.iesmz;

public class EmpleadoBR {

    public static float calculaSalarioBruto(TipoEmpleado tipus, float ventasMes, float horasExtra){
        if (tipus == null || ventasMes < 0 ||horasExtra <0){
            return -1;
        }
        float saldo;
        if (tipus.name().equalsIgnoreCase(TipoEmpleado.venedor.name())) saldo = 1000;
        else saldo = 1500;

        if (ventasMes >= 1500) saldo += 200;
        else if (ventasMes >= 1000) saldo += 100;

        return saldo + (horasExtra*20);
    }

    public static float calculaSalarioNeto(float salarioBruto){
        if (salarioBruto < 0) return -1;

        if (salarioBruto >= 1500) return (float) (salarioBruto * 0.82); // Porque no funciona (salarioBruto * (1-(18/100))
        else if (salarioBruto >= 1000) return (float) (salarioBruto * 0.84);
        else return salarioBruto;
    }
}
