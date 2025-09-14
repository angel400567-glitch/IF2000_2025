/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author dylan
 */
public abstract class  Account {
    //Atributes
  
    private String accountNumber;
    double balance;
    Client client;

    public Account() {
    }

    public Account(String accountNumber, double balance, Client client) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.client = client;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
     //-----------------------
    //Methods for polimorfism    
    //-----------------------
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double interestCalculation();

    @Override
    public String toString() {
        
        String result = "\nBANK Account INFORMATION:"
                +"\n--------------------------------"
                +"\nAccount Number: "+this.getAccountNumber()
                +"\nBlance: "+this.getBalance()
                +"\nAccount Owner:\n "+this.getClient().toString()
                +"\n";
             return result;
                
         
    }//endToString
    
    
}//endClass


