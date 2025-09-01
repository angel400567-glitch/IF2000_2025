/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;  

import java.util.Scanner;

public class Lab2_ejericios {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 13. Suma de todos los pares entre 2 y 1000
        int sumaPares = 0;
        for (int i = 2; i <= 1000; i += 2) {
            sumaPares += i;
        }
        System.out.println("13) Suma de pares 2-1000 = " + sumaPares);

        // 14. Convertir Celsius a Fahrenheit
        System.out.print("14) Ingrese grados Celsius: ");
        double c = sc.nextDouble();
        double f = (9.0/5.0)*c + 32;
        System.out.println("   Fahrenheit = " + f);

        // 15. Programa que lee un numero entero X y otro número entero Ny, calcula la enésima
       // potencia de X. X^n
        System.out.print("15) Ingrese X: ");
        int x = sc.nextInt();
        System.out.print("Ingrese N: ");
        int n = sc.nextInt();
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= x;
        }
        System.out.println("   Resultado = " + resultado);

        // 16. imprima un numero y indique el mes del año al que corresponde
        System.out.print("16) Ingrese número del mes (1-12): ");
        int mes = sc.nextInt();
        String nombreMes;
        if (mes == 1) nombreMes = "Enero";
        else if (mes == 2) nombreMes = "Febrero";
        else if (mes == 3) nombreMes = "Marzo";
        else if (mes == 4) nombreMes = "Abril";
        else if (mes == 5) nombreMes = "Mayo";
        else if (mes == 6) nombreMes = "Junio";
        else if (mes == 7) nombreMes = "Julio";
        else if (mes == 8) nombreMes = "Agosto";
        else if (mes == 9) nombreMes = "Septiembre";
        else if (mes == 10) nombreMes = "Octubre";
        else if (mes == 11) nombreMes = "Noviembre";
        else if (mes == 12) nombreMes = "Diciembre";
        else nombreMes = "Número inválido";
        System.out.println("   Mes: " + nombreMes);

        // 17. Función F(x)
        System.out.print("17) Ingrese X: ");
        int xval = sc.nextInt();
        if (xval > 0) System.out.println("   F(x) = " + (xval + 5));
        else if (xval < 0) System.out.println("   F(x) = " + (xval * xval));
        else System.out.println("   F(x) = 1");

        // 18. Área de triángulo
        System.out.print("18) Ingrese lado a: ");
        double a = sc.nextDouble();
        System.out.print("Ingrese lado b: ");
        double b = sc.nextDouble();
        System.out.print("Ingrese lado c: ");
        double c2 = sc.nextDouble();
        double p = (a + b + c2) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c2));
        System.out.println("   Área = " + area);

        // 19. Intercambiar A y B
        System.out.print("19) Ingrese A: ");
        int A = sc.nextInt();
        System.out.print("Ingrese B: ");
        int B = sc.nextInt();
        int temp = A; A = B; B = temp;
        System.out.println("   Ahora A=" + A + ", B=" + B);

        // 20. Ecuación de la recta y=mx+b
        System.out.print("20) Ingrese X0: ");
        double x0 = sc.nextDouble();
        System.out.print("Ingrese Y0: ");
        double y0 = sc.nextDouble();
        System.out.print("Ingrese X1: ");
        double x1 = sc.nextDouble();
        System.out.print("Ingrese Y1: ");
        double y1 = sc.nextDouble();
        double m = (y0 - y1) / (x0 - x1);
        double brecta = y0 - m*x0;
        System.out.println("   Recta: y = " + m + "x + " + brecta);

        // 21. Suma de naturales menores que K
        System.out.print("21) Ingrese K: ");
        int K = sc.nextInt();
        int sumaK = 0;
        for (int i = 1; i < K; i++) sumaK += i;
        System.out.println("   Suma = " + sumaK);

        // 22. Promedio de números positivos
        System.out.print("22) Cuántos números ingresará?: ");
        int cant = sc.nextInt();
        double sumaPos = 0;
        for (int i = 1; i <= cant; i++) {
            System.out.print("   Número " + i + ": ");
            double valor = sc.nextDouble();
            sumaPos += valor;
        }
        double promedio = sumaPos / cant;
        System.out.println("   Promedio = " + promedio);

        // 23. 10 números: pares, impares y sumas
        int sumaP = 0, sumaI = 0, pares = 0, impares = 0, sumaTotal = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("23) Número " + i + ": ");
            int num = sc.nextInt();
            sumaTotal += num;
            if (num % 2 == 0) { pares++; sumaP += num; }
            else { impares++; sumaI += num; }
        }
        System.out.println("   Pares: " + pares + ", suma = " + sumaP);
        System.out.println("   Impares: " + impares + ", suma = " + sumaI);
        System.out.println("   Suma total = " + sumaTotal);

        // 24. Suma de pares e impares entre 1 y 200
        int sumPar = 0, sumImp = 0;
        for (int i = 1; i <= 200; i++) {
            if (i % 2 == 0) sumPar += i;
            else sumImp += i;
        }
        System.out.println("24) Suma pares = " + sumPar + ", suma impares = " + sumImp);

        // 25. Suma de cuadrados 1 a 100
        int sumaCuad = 0;
        for (int i = 1; i <= 100; i++) sumaCuad += i*i;
        System.out.println("25) Suma cuadrados 1-100 = " + sumaCuad);

        // 26. Factorial de N
        System.out.print("26) Ingrese N: ");
        int N = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= N; i++) fact *= i;
        System.out.println("   Factorial = " + fact);

        // 27.  Calcular el valor máximo de una serie de 10 números. 
        int max = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("27) Número " + i + ": ");
            int valor = sc.nextInt();
            if (i == 1 || valor > max) max = valor;
        }
        System.out.println("   Máximo = " + max);
    }
}
