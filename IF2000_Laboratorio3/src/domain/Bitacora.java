/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Bitacora {

    private static int eventId = 1;
    private static final List<String> events = new ArrayList<>();

    public static void addEvent(String type, Account account, double amount) {
        LocalDateTime now = LocalDateTime.now();
        String event = "EventID: " + eventId++ +
                ", Type: " + type +
                ", Date: " + now +
                ", Account: " + account.getAccountNumber() +
                ", Holder: " + account.getClient().getFirstName() +
                ", Amount: " + String.format("%.2f", amount) +
                ", Balance: " + String.format("%.2f", account.getBalance());
        events.add(event);
    }

    public static void showLog() {
        for (String e : events) {
            System.out.println(e);
        }
    }
}
