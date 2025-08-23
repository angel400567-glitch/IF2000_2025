/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dylan
 */
public class Ejercicios_Semana2_PracticaEnClase {
       public Ejercicios_Semana2_PracticaEnClase() {
    }
    

    

    /**
     *
     */
   
    // ---------------------------
    // Ejercicio A:  Realice un algoritmo que permita formar la siguiente figura: 
    // ---------------------------
    public void ejercicioA() {
        int filas = 5, columnas = 5;
        System.out.println("\nEjercicio A");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print((i==0||i==filas-1||j==0||j==columnas-1) ? "* " : "  ");
            }
            System.out.println();
        }
    }

    // ---------------------------
    // Ejercicio B: Realice un algoritmo que permite formar la siguiente figura: 
    // ---------------------------
    public void ejercicioB() {
        int n = 12;
        System.out.println("\nEjercicio B");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
    }

    // ---------------------------
    // Ejercicio C:  Realice un algoritmo que permita formar la siguiente figura: 
    // ---------------------------
    public void ejercicioC() {
        int n = 10;
        System.out.println("\nEjercicio C");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) System.out.print(" ");
            for (int k = 0; k < n - i; k++) System.out.print("*");
            System.out.println();
        }
    }

    // ---------------------------
    // Ejercicio D: Realice un algoritmo que permita ingresar 10 números enteros en forma desordenada en un 
    //Arreglo de tamaño 10 y luego ordenar ascendentemente el mismo, al final deberá realizar la 
    //impresión del arreglo para mostrar el resultado. 
    // ---------------------------
    public void ejercicioD() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        System.out.println("\nEjercicio D");
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        Arrays.sort(numeros);
        System.out.println("\nArreglo ordenado ascendentemente:");
        for (int num : numeros) System.out.print(num + " ");
        System.out.println();
    }

    // ---------------------------
    // Ejercicio E: Realice un algoritmo que genere 100 números enteros en forma aleatoria y se almacenen en un 
    //Arreglo de tamaño 100 y luego ordenar descendentemente el mismo, al final deberá realizar la 
    //impresión del arreglo para mostrar el resultado. 
    // ---------------------------
    public void ejercicioE() {
        Integer[] numeros = new Integer[100];
        Random rand = new Random();
        for (int i = 0; i < 100; i++) numeros[i] = rand.nextInt(1000) + 1;
        Arrays.sort(numeros, Collections.reverseOrder());
        System.out.println("\nEjercicio E: Arreglo descendente aleatorio:");
        for (int num : numeros) System.out.print(num + " ");
        System.out.println();
    }

    // ---------------------------
    // Ejercicio F: Realice un algoritmo que permita mostrar una partida inicial de “Tablero” con ayuda de una 
    //matriz, las fichas negras se podrán representar con la letra “N” y las rojas con la letra “R”, al final 
    //deberá mostrar algo como lo siguiente. 
    // ---------------------------
    public void ejerciciof() {
        char[][] redonda = new char[8][8];
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++)
                redonda[i][j] = ' ';

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 8; j++)
                if ((i + j) % 2 == 1) redonda[i][j] = 'N';

        for (int i = 5; i < 8; i++)
            for (int j = 0; j < 8; j++)
                if ((i + j) % 2 == 1) redonda[i][j] = 'R';

        System.out.println("\nredonda");
        System.out.print("  ");
        for (int i = 1; i <= 8; i++) System.out.print(i + " ");
        System.out.println();

        for (int i = 0; i < 8; i++) {
            System.out.print((char)('A'+i) + " ");
            for (int j = 0; j < 8; j++) System.out.print(redonda[i][j] + " ");
            System.out.println();
        }
    }
       }
      

