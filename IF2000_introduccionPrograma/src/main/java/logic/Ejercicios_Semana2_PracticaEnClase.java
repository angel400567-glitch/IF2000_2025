/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;



import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Ejercicios_Semana2_PracticaEnClase {

    public Ejercicios_Semana2_PracticaEnClase() {
    }

    public void ejercicioA() {
        int filas = 5, columnas = 5;
        System.out.println("\nEjercicio A");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print((i == 0 || i == filas - 1 || j == 0 || j == columnas - 1) ? "* " : "  ");
            }
            System.out.println();
        }
    }

    public void ejercicioB() {
        int n = 12;
        System.out.println("\nEjercicio B");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
    }

    public void ejercicioC() {
        int n = 10;
        System.out.println("\nEjercicio C");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) System.out.print(" ");
            for (int k = 0; k < n - i; k++) System.out.print("*");
            System.out.println();
        }
    }

    public void ejercicioD(Scanner sc) {
        int[] numeros = new int[10];
        System.out.println("\nEjercicio D");
        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.print("Numero " + (i + 1) + ": ");
                if (sc.hasNextInt()) {
                    numeros[i] = sc.nextInt();
                    break;
                } else {
                    System.out.println("Debes ingresar un número entero.");
                    sc.next();
                }
            }
        }
        Arrays.sort(numeros);
        System.out.println("\nArreglo ordenado ascendentemente:");
        for (int num : numeros) System.out.print(num + " ");
        System.out.println();
    }

    public void ejercicioE() {
        Integer[] numeros = new Integer[100];
        Random rand = new Random();
        for (int i = 0; i < 100; i++) numeros[i] = rand.nextInt(1000) + 1;
        Arrays.sort(numeros, Collections.reverseOrder());
        System.out.println("\nEjercicio E: Arreglo descendente aleatorio:");
        for (int num : numeros) System.out.print(num + " ");
        System.out.println();
    }

    public void ejercicioF() {
        char[][] tablero = new char[8][8];
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++)
                tablero[i][j] = ' ';

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 8; j++)
                if ((i + j) % 2 == 1) tablero[i][j] = 'N';

        for (int i = 5; i < 8; i++)
            for (int j = 0; j < 8; j++)
                if ((i + j) % 2 == 1) tablero[i][j] = 'R';

        System.out.println("\nTablero de damas:");
        System.out.print("  ");
        for (int i = 1; i <= 8; i++) System.out.print(i + " ");
        System.out.println();

        for (int i = 0; i < 8; i++) {
            System.out.print((char) ('A' + i) + " ");
            for (int j = 0; j < 8; j++) System.out.print(tablero[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Ejercicios_Semana2_PracticaEnClase obj = new Ejercicios_Semana2_PracticaEnClase();
        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        do {
            System.out.println("\n--- MENÚ DE EJERCICIOS ---");
            System.out.println("1. Ejercicio A");
            System.out.println("2. Ejercicio B");
            System.out.println("3. Ejercicio C");
            System.out.println("4. Ejercicio D");
            System.out.println("5. Ejercicio E");
            System.out.println("6. Ejercicio F (Tablero)");
            System.out.println("0. Salir");

            while (true) {
                System.out.print("Elige una opción: ");
                if (sc.hasNextInt()) {
                    opcion = sc.nextInt();
                    break;
                } else {
                    System.out.println("Debes ingresar un número entero.");
                    sc.next();
                }
            }

            switch (opcion) {
                case 1:
                    obj.ejercicioA();
                    break;
                case 2:
                    obj.ejercicioB();
                    break;
                case 3:
                    obj.ejercicioC();
                    break;
                case 4:
                    obj.ejercicioD(sc);
                    break;
                case 5:
                    obj.ejercicioE();
                    break;
                case 6:
                    obj.ejercicioF();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
