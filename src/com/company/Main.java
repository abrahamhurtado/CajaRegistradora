package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        iniciarPrograma();
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
                System.out.println("¿Cuánto quieres retirar? ");
                retirarEfectivo(Integer.parseInt(escanea.nextLine()));
                break;
            }
            case "2": {
                imprimirSaldo();
                break;
            }
            case "3": {
                imprimirEfectivo();
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

    public static int calcularDineroTotal () {
        return ((billetes1000 * 1000) + (billetes500 * 500) + (billetes200 * 200) + (billetes100 * 100) + (billetes50 * 50));
    }

    public static void retirarEfectivo (int cantidad) {

        if (cantidad > calcularDineroTotal()) {
            System.out.println("El saldo en caja es: " + (calcularDineroTotal() - cantidad));
            billetes1000 = 0;
            billetes500 = 0;
            billetes200 = 0;
            billetes100 = 0;
            billetes50 = 0;
            imprimirEfectivo();
            System.exit(1);
        } else {
            int stateMachine = cantidad%1000;

            billetes1000 = billetes1000 - (cantidad - cantidad%1000)/1000;

            if (billetes1000 < 0) {
                stateMachine = stateMachine + ((0 - billetes1000) * 1000);
                billetes1000 = 0;
            }

            billetes500 = billetes500 - (stateMachine - stateMachine%(500))/500;

            stateMachine = stateMachine%500;

            if (billetes500 < 0) {
                stateMachine = stateMachine + ((0 - billetes500) * 500);
                billetes500 = 0;
            }

            billetes200 = billetes200 - (stateMachine - stateMachine%200)/200;

            stateMachine = stateMachine%200;

            if (billetes200 < 0) {
                stateMachine = stateMachine + ((0 - billetes200) * 200);
                billetes200 = 0;
            }

            billetes100 = billetes100 - (stateMachine - stateMachine%100)/100;

            stateMachine = stateMachine%100;

            if (billetes100 < 0) {
                stateMachine = stateMachine + ((0 - billetes100) * 100);
                billetes100 = 0;
            }

            billetes50 = billetes50 - (stateMachine - stateMachine%50)/50;
        }
        imprimirEfectivo();
    }

    public static void imprimirSaldo () {
        System.out.println("El saldo total es: " + calcularDineroTotal());
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
