package Ejercisio5;

import java.util.Scanner;

public class Ejercisio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int saldo_inicial = 1000;
        double saldo_final;
        int operacion;
        double dinero;
        double dinero_total;
        double retiro;

        System.out.println("que operacion quiere realizar  ");
        System.out.println("1. Ingresar dinero a su cuenta");
        System.out.println("2. Retirar dinero de su cuenta");
        System.out.println("3. Salir del cajero");
        System.out.println(" el dinero que usted tiene inicialmente es de "+saldo_inicial);
        operacion = entrada.nextInt();
        
        switch (operacion) {
            case 1:
                System.out.println(" ingresar dinero a su cuenta ");
                dinero = entrada.nextDouble();
                saldo_final = dinero + saldo_inicial;
                System.out.println(" el dinero que tiene es de " + saldo_final);
                break;
            case 2:
                System.out.println(" retirar dinero de su cuenta");
                retiro = entrada.nextDouble();
                if (saldo_inicial > retiro) {
                    saldo_final = saldo_inicial - retiro;
                    System.out.println(" el dinero que queda es de "+saldo_final);
                } else {
                    System.out.println(" no tiene dinero suficiente para realizar dicha operacion");
                }
                break;
            case 3:
                System.out.println(" salir ");
                break;
            default:
                System.out.println("fuera de rango ");

        }

    }

}
