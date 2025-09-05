/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IF2000_introduccionPrograma;

import static buildinfo.BuildInfo.name;
import domain.Person;
import domain.SavingAccount;

/**
 *
 * @author dylan
 */
public class IF2000_introduccionPrograma {
     public static void main(String[] args) {
        // TODO code application logic here
        
        Person client1= new Person("Edgardo","Corrales","123-234-456","454567",18);
        
        SavingAccount account1= new SavingAccount("2025-09-04",12,5,"10000567",25000,client1);
        
        //simulation of  depositm of 3000colones in the account
        account1.deposit(3000);
 
        System.out.println(account1.toString());





//Data types
        //String name = "Lionel";
        //int age = 40;
        
        //System.out.println ("Hello World");
        //System.out.println ("Name:"+ name);
        //System.out.println ("Age:"+ age);
        
        //Python:
        //print('Hola Mundo')
        
        /*Tipos de datos numéricos
        int, long, short, float, double, numeric, money, decimal
        
        Manejo de flechas:
        Date
        
        Cadenass de caracteres:
        String, char
        
        Obejectos:
        Object
        
        Data Structures:
        Arrays or Vectors: int[] x;
                           int[][] y;
        
        
        True/False:
        boolean
        
        */
        
    }
    
}