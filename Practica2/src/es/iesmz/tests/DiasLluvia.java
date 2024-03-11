package es.iesmz.tests;

public class DiasLluvia {
    private final boolean[][] calendario = new boolean[12][31];


    public boolean registroDia(int dia, int mes, boolean lluvia){
        if (validarFecha(dia-1, mes-1)){
            calendario[mes-1][dia-1] = lluvia;
            return true;
        }else return false;
    }

    public boolean consultarDia(int dia, int mes){
        if (validarFecha(dia-1, mes-1)){
            return calendario[mes-1][dia-1];
        }else return false;
    }

    public int contarDiasLluviosos(){
        int cont = 0;
        for (int i = 0; i < calendario.length; i++) {
            for (int j = 0; j < calendario[0].length; j++) {
                if (calendario[i][j]) cont++;
            }
        }
        return cont;
    }

    private boolean validarFecha(int dia, int mes){
        if ((dia < 31 && dia >= 0) && (mes >= 0 && mes < 12)){
            if (mes == 1 && dia >= 29) return false;
            return true;
        }else return false;
    }
}
