package es.iesmz.tests;

public class DiasLluvia {
    private final boolean[][] calendario = new boolean[12][31];


    public boolean registroDia(int dia, int mes, boolean lluvia){
        if ((dia <= 31 && dia > 0) || (mes > 0 && mes <= 12) ){
            calendario[mes][dia] = lluvia;
            return true;
        }else return false;
    }

    public boolean consultarDia(int dia, int mes){
        if ((dia <= 31 && dia > 0) || (mes > 0 && mes <= 12) ){
            return calendario[mes][dia];
        }else return false;
    }
}
