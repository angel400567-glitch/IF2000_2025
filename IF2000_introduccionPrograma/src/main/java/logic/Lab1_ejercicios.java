/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;


import java.util.Scanner;


/**
 * Lab1 - Ejercicios de diagramas de flujo
 * Autor: Dylan
 */
public class Lab1_ejercicios {

    Scanner sc = new Scanner(System.in);

    // 1) Par o impar
    public void ejercicio1() {
        System.out.print("Ingrese un número entero: ");
        int num = sc.nextInt();
        if (num % 2 == 0) System.out.println(num + " es par");
        else System.out.println(num + " es impar");
    }

    // 2) Valor absoluto
    public void ejercicio2() {
        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();
        System.out.println("Valor absoluto: " + Math.abs(num));
    }

    // 3) Suma de la serie 3,6,9,...,99
    public void ejercicio3() {
        int suma = 0;
        System.out.println("Serie: ");
        for (int i = 3; i <= 99; i += 3) {
            System.out.print(i + " ");
            suma += i;
        }
        System.out.println("\nSuma total: " + suma);
    }

    // 4) Tres números en orden ascendente
    public void ejercicio4() {
        System.out.print("Ingrese primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingrese segundo número: ");
        int b = sc.nextInt();
        System.out.print("Ingrese tercer número: ");
        int c = sc.nextInt();

        int temp;
        if (a > b) { temp = a; a = b; b = temp; }
        if (b > c) { temp = b; b = c; c = temp; }
        if (a > b) { temp = a; a = b; b = temp; }

        System.out.println("Orden ascendente: " + a + ", " + b + ", " + c);
    }

    // 5) Operación según comparación
    public void ejercicio5() {
        System.out.print("Ingrese primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingrese segundo número: ");
        int b = sc.nextInt();

        int resultado;
        if (a == b) resultado = a * b;
        else if (a > b) resultado = a - b;
        else resultado = a + b;

        System.out.println("Resultado: " + resultado);
    }

    // 6) Nota 10
    public void ejercicio6() {
        boolean hay10 = false;
        int nota;
        do {
            System.out.print("Ingrese nota (0-10, -1 para terminar): ");
            nota = sc.nextInt();
            if (nota == 10) hay10 = true;
        } while (nota != -1);

        if (hay10) System.out.println("Hubo al menos una nota con valor 10");
        else System.out.println("No hubo ninguna nota con valor 10");
    }

    // 7) Pulsaciones
    public void ejercicio7() {
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        System.out.print("Ingrese su sexo (M/F): ");
        char sexo = sc.next().toUpperCase().charAt(0);

        double pulsaciones = (sexo == 'F') ? (220 - edad)/10.0 : (210 - edad)/10.0;
        System.out.println("Número de pulsaciones por cada 10 segundos: " + pulsaciones);
    }

    // 8) Utilidad según antigüedad
    public void ejercicio8() {
        System.out.print("Ingrese salario mensual: ");
        double salario = sc.nextDouble();
        System.out.print("Ingrese años de antigüedad: ");
        double antiguedad = sc.nextDouble();

        double porcentaje;
        if (antiguedad < 1) porcentaje = 0.05;
        else if (antiguedad < 2) porcentaje = 0.07;
        else if (antiguedad < 5) porcentaje = 0.10;
        else if (antiguedad < 10) porcentaje = 0.15;
        else porcentaje = 0.20;

        double utilidad = salario * porcentaje;
        System.out.println("Utilidad: " + utilidad);
    }

    // 9) Número primo
    public void ejercicio9() {
        System.out.print("Ingrese un número N: ");
        int N = sc.nextInt();
        boolean primo = true;
        if (N < 2) primo = false;
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) { primo = false; break; }
        }
        System.out.println(N + (primo ? " es primo" : " no es primo"));
    }

    // 10) Descuento por compra de computadoras
    public void ejercicio10() {
        System.out.print("Ingrese número de computadoras: ");
        int cantidad = sc.nextInt();
        double precioUnitario = 11000;
        double total = cantidad * precioUnitario;
        double descuento;

        if (cantidad < 5) descuento = 0.10;
        else if (cantidad < 10) descuento = 0.20;
        else descuento = 0.40;

        double montoDescuento = total * descuento;
        double totalPagar = total - montoDescuento;

        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio total sin descuento: " + total);
        System.out.println("Monto descontado: " + montoDescuento);
        System.out.println("Total a pagar: " + totalPagar);
    }

    // 11) Lista de números primos hasta N
    public void ejercicio11() {
        System.out.print("Ingrese un número N: ");
        int N = sc.nextInt();
        System.out.println("Números primos hasta " + N + ":");
        for (int i = 2; i <= N; i++) {
            boolean primo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) { primo = false; break; }
            }
            if (primo) System.out.print(i + " ");
        }
        System.out.println();
    }

    // 12) Área de un triángulo
    public void ejercicio12() {
        System.out.print("Ingrese base del triángulo: ");
        double base = sc.nextDouble();
        System.out.print("Ingrese altura del triángulo: ");
        double altura = sc.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("Área del triángulo: " + area);
    }

    // Menú interactivo
    public void menu() {
        int opcion;
        do {
            System.out.println("\n--- MENÚ DE EJERCICIOS LAB1 ---");
            for (int i = 1; i <= 12; i++) System.out.println(i + ". Ejercicio " + i);
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch(opcion) {
                case 1: ejercicio1(); break;
                case 2: ejercicio2(); break;
                case 3: ejercicio3(); break;
                case 4: ejercicio4(); break;
                case 5: ejercicio5(); break;
                case 6: ejercicio6(); break;
                case 7: ejercicio7(); break;
                case 8: ejercicio8(); break;
                case 9: ejercicio9(); break;
                case 10: ejercicio10(); break;
                case 11: ejercicio11(); break;
                case 12: ejercicio12(); break;
                case 0: System.out.println("Saliendo..."); break;
                default: System.out.println("Opción inválida"); break;
            }
        } while(opcion != 0);
    }

    public static void main(String[] args) {
        Lab1_ejercicios obj = new Lab1_ejercicios();
        obj.menu();
    }
}