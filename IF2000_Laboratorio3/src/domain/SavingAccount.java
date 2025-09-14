/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

public class SavingAccount extends Account {

    private String startDate;
    private int months;
    private double interestRate;
    private double gainedInterest;

    public SavingAccount(String startDate, int months, double interestRate,
                         String accountNumber, double balance, Client client) {
        super(accountNumber, balance, client);
        this.startDate = startDate;
        this.months = months;
        this.interestRate = interestRate / 100.0; // si pones 5, se convierte a 0.05
        this.gainedInterest = 0;
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        Bitacora.addEvent("Deposit", this, amount);
    }

    @Override
    public void withdraw(double amount) {
        if(amount > getBalance()) {
            System.out.println("Insufficient funds for withdrawal.");
            return;
        }
        setBalance(getBalance() - amount);
        Bitacora.addEvent("Withdrawal", this, amount);
    }

    public double calculateInterest() {
        gainedInterest = months * getBalance() * interestRate;
        setBalance(getBalance() + gainedInterest);
        return gainedInterest;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nAccount Type: SAVING ACCOUNT" +
               "\n------------------------------------" +
               "\nInitial date: " + startDate +
               "\nMonths of saving: " + months +
               "\nInterest: " + (interestRate * 100) + "%" +
               "\nGained interest: " + String.format("%.2f", gainedInterest) +
               "\nBalance after interest: " + String.format("%.2f", getBalance());
    }

    // Getters
    public int getMonths() { return months; }
    public double getInterestRate() { return interestRate; }
    public double getGainedInterest() { return gainedInterest; }

    @Override
    public double interestCalculation() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
