package endes.sueldo;

import java.util.Scanner;

public class ENDESSueldo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numTarjeta = -1;

        do {

            System.out.println("Introduce tu edad: ");
            int edad = sc.nextInt();

            if (edad >= 18 && edad <= 80) {
                System.out.println("Introduce tu salario: ");
                double sueldo = sc.nextDouble();
                asignarTarjeta(edad, sueldo);
            } else {
                System.err.println("Por tu edad no tienes acceso a la tarjeta");
            }

            System.out.println("Introduce 0 si quieres salir del programa, otro numero para seguir");
            numTarjeta = sc.nextInt();
        } while (numTarjeta != 0);
    }

    public static void asignarTarjeta(int edad, double sueldo) {

        if (sueldo < 800) {
            System.err.println("Por tu salario no tienes acceso a tarjeta");
        } else if (sueldo >= 800 && sueldo < 1500) {
            System.out.println("Acceso a tarjeta oro");
        } else if (sueldo >= 1500 && sueldo < 3000) {
            System.out.println("Acceso a tarjeta platino");
        } else {
            System.out.println("Acceso a tarjeta black");
        }
    }
}
