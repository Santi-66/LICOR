package org.example;

import org.example.CLIENTE.CLIENTE;
import org.example.LICOR.LICOR;

public class Main {
    public static void main(String[] args) {
        //constructores vacios
        LICOR licorUNO = new LICOR();
        LICOR licorDOS = new LICOR("sake",50000,60,50,"AMURAI (DULCE)");

        CLIENTE clienteUNO = new CLIENTE();
        CLIENTE clienteDOS = new CLIENTE("juan","1100987092","cra98 #25-10",3027649364,"masculino");

        //accediendo a los atributos
        System.out.println(licorUNO.getMARCA();
        System.out.println(licorDOS.getMARCA());



    }
}