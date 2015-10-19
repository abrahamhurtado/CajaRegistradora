package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int billetes1000 = 10;
    public static int billetes500 = 10;
    public static int billetes200 = 10;
    public static int billetes100 = 10;
    public static int billetes50 = 10;

    public static void iniciarPrograma () {
        String opcion;
        Scanner escanea = new Scanner(System.in);

        System.out.println("**M E N Ú**");
        System.out.println("1. Retiro");
        System.out.println("2. Saldo");
        System.out.println("3. Efectivo");
        System.out.println("4. Salir");

        System.out.println("Elige tu opción");
        opcion = escanea.nextLine();

        switch (opcion) {
            case "1": {
//                accionUsuario(1);
                break;
            }
            case "2": {
//                accionUsuario(1,1);
                break;
            }
            case "3": {
//                accionUsuario(1,1,1);
                break;
            }
            case "4": {
                System.exit(1);
                break;
            }
            default: {
                break;
            }
        }

    }

    public static void retirarEfectivo (int cantidad) {
        switch (cantidad) {
            case (cantidad >= 1000): {

            }
        }
//        int stateMachine = 0;
//        if (billetes1000 > 0) {
//            if ((cantidad - (cantidad%1000))/1000 > 10) {
//                stateMachine = (cantidad - (cantidad%1000))/1000 - 10;
//                billetes1000 -= 10;
//            } else {
//                billetes1000 -= (cantidad - (cantidad%1000))/1000;
//            }
//        }
//        if (billetes500 > 0) {
//            billetes500 -= (stateMachine*2);
//            if ((cantidad - (cantidad%500))/500 > 10)
//        }
    }

    public static void imprimirSaldo () {
        System.out.println("El saldo total es: " + (billetes1000 * 1000) + (billetes500 * 500) + (billetes200 * 200) + (billetes100 * 100) + (billetes50 * 50));
        System.out.println();
        iniciarPrograma();
    }

    public static void imprimirEfectivo () {
        System.out.println("Hay " + billetes1000 + " billetes de 1000");
        System.out.println("Hay " + billetes500 + " billetes de 500");
        System.out.println("Hay " + billetes200 + " billetes de 200");
        System.out.println("Hay " + billetes100 + " billetes de 100");
        System.out.println("Hay " + billetes50 + " billetes de 50");
        System.out.println();
        iniciarPrograma();
    }

}
