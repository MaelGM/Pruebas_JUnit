package es.iesmz.tests;

import java.math.BigInteger;

public class Compte {


    public boolean compruebaIBAN(String anaves){
        boolean pais = false, digitos = false;
        if (anaves.substring(0,2).equalsIgnoreCase("ES")) pais = true;
        try{
            BigInteger numeros = new BigInteger(anaves.substring(4)+"142800");
            BigInteger num = new BigInteger("97");
            BigInteger resto = numeros.mod(num);
            if (98-resto.intValue() == Integer.parseInt(anaves.substring(2,4))) digitos = true;
        }catch (NumberFormatException | ArithmeticException e){
            e.printStackTrace();
            return false;
        }

        return pais && digitos;
    }

    public String generaIBAN(String entitat, String oficina, String dc, String compte){
        BigInteger numeros;
        String nums = entitat+oficina+dc+compte;
        if (nums.length() != 20) return null;
        try{
            numeros = new BigInteger(entitat+oficina+dc+compte+"142800");
        }catch (NumberFormatException | ArithmeticException e){
            e.printStackTrace();
            return null;
        }
        BigInteger resto = numeros.mod(new BigInteger("97"));
        String codigo = String.valueOf(98-resto.intValue());

        return "ES"+codigo+nums;
    }
}
