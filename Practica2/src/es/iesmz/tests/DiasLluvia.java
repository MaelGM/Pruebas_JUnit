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

    public int trimestreLluvioso(){
        int cont1 = 0, cont2 = 0, cont3 =0, cont4 =0, max = 0;
        for (int i = 0; i <calendario.length ; i++) {
            if (i<=2) {
                for (int j = 0; j < calendario[i].length; j++) {
                    if (calendario[i][j]) cont1++;
                }
                if (cont1 > max) max = cont1;
            }

            if (i>=3 && i<=5) {
                for (int j = 0; j < calendario[i].length; j++) {
                    if (calendario[i][j]) cont2++;
                }
                if (cont2 > max) max = cont2;
            }

            if (i>=6 && i<=8) {
                for (int j = 0; j < calendario[i].length; j++) {
                    if (calendario[i][j]) cont3++;
                }
                if (cont3 > max) max = cont3;
            }

            if (i>=9 && i<=11) {
                for (int j = 0; j < calendario[i].length; j++) {
                    if (calendario[i][j]) cont4++;
                }
                if (cont4 > max) max = cont4;
            }
        }
        if (max == cont1) return 1;
        else if (max == cont2) return 2;
        else if (max == cont3) return 3;
        else return 4;
    }

    public int primerDiaLluvia(){
        int dias = 0;
        for (int i = 0; i < calendario.length; i++) {
            for (int j = 0; j < calendario[i].length; j++) {
                dias++;
                if (calendario[i][j]) return dias;
            }
        }
        return -1;
    }

    private boolean validarFecha(int dia, int mes){
        if ((dia < 31 && dia >= 0) && (mes >= 0 && mes < 12)){
            if (mes == 1 && dia >= 29) return false;
            return true;
        }else return false;
    }
}
