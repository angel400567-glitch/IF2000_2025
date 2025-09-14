package if2000_laboratorio3;

import domain.Bitacora;
import domain.CheckingAccount;
import domain.Client;
import domain.SavingAccount;
import domain.SinpeMobile;

public class IF2000_Laboratorio3 {

    public static void main(String[] args) {

        // Crear clientes
        Client client1 = new Client("Edgardo", "Corrales", "1-2323-4545", "45456789", 18, "Cartago");
        Client client2 = new Client("Ana", "Sanchez", "1-9876-5432", "12345678", 25, "San Jose");

        // Crear cuentas
        CheckingAccount checking1 = new CheckingAccount("10001", 50000, client1, 0.02);
        SavingAccount saving1 = new SavingAccount("2025-09-04", 12,5, "20001", 30000, client2);

        // Depósitos y retiros individuales
        checking1.deposit(3000);
        saving1.withdraw(5000);

        // Transferencia SINPE
        SinpeMobile.transfer(checking1, saving1, 15000);

        // Calcular intereses
        checking1.calculateInterest();
        saving1.calculateInterest();

        // Mostrar balances
        System.out.println(checking1);
        System.out.println(saving1);

        // Mostrar Bitácora
        System.out.println("\n=== BITÁCORA ===");
        Bitacora.showLog();
    }
}
