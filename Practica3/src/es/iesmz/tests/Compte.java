package es.iesmz.tests;

import java.math.BigInteger;

public class Compte {


    public boolean compruebaIBAN(String anaves){
        boolean pais = false, digitos = false;
        if (anaves.substring(0,2).equalsIgnoreCase("ES")) pais = true;
        BigInteger numeros = new BigInteger(anaves.substring(4)+"142800");
        BigInteger num = new BigInteger("97");
        BigInteger resto = numeros.mod(num);

        if (98-resto.intValue() == Integer.parseInt(anaves.substring(2,4))) digitos = true;

        return pais && digitos;
    }
}
