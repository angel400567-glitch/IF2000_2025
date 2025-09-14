/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author dylan
 */
public class SinpeMobile {
    /**
     * Simulate a SINPE Móvil transfer from one account to another
     * @param fromAccount source account
     * @param toAccount destination account
     * @param amount amount to transfer
     */
    public static void transfer(Account fromAccount, Account toAccount, double amount) {

        // Validar saldo
        if (fromAccount.getBalance() < amount) {
            System.out.println("Insufficient funds in source account for transfer.");
            return;
        }

        // Validar que las cuentas sean de bancos (puedes agregar un atributo bank si quieres)
        if (fromAccount == null || toAccount == null) {
            System.out.println("One of the accounts is invalid.");
            return;
        }

        // Realizar la transferencia
        fromAccount.withdraw(amount);
        toAccount.deposit(amount);

        // Registrar el evento en Bitácora
        Bitacora.addEvent("SINPE Transfer", fromAccount, -amount); // retiro de origen
        Bitacora.addEvent("SINPE Transfer", toAccount, amount);     // depósito en destino

        System.out.println("Transfer successful: " + amount + " transferred from " 
                           + fromAccount.getAccountNumber() + " to " + toAccount.getAccountNumber());
    }
}

