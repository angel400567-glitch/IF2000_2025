/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author dylan
 */





public  class CheckingAccount extends Account {

    private double interestRate;   // e.g., 0.02 for 2%
    private double gainedInterest;

    public CheckingAccount(String accountNumber, double balance, Client client, double interestRate) {
        super(accountNumber, balance, client);
        this.interestRate = interestRate;
        this.gainedInterest = 0;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        Bitacora.addEvent("Deposit", this, amount); // Cambio: Bitacora
    }

    @Override
    public void withdraw(double amount) {
        if(amount > balance) {
            System.out.println("Insufficient funds for withdrawal.");
            return;
        }
        balance -= amount;
        Bitacora.addEvent("Withdrawal", this, amount); // Cambio: Bitacora
    }

    public double calculateInterest() {
        // Monthly interest: balance * rate / 12
        gainedInterest = (balance * interestRate) / 12;
        balance += gainedInterest;
        return gainedInterest;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nAccount Type: CHECKING ACCOUNT" +
               "\n------------------------------------" +
               "\nInterest: " + (interestRate * 100) + "%" +
               "\nGained interest: " + String.format("%.2f", gainedInterest) +
               "\nBalance after interest: " + String.format("%.2f", balance);
    }

    public double getInterestRate() { return interestRate; }
    public double getGainedInterest() { return gainedInterest; }

    @Override
    public double interestCalculation() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
