/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
/**
 *
 * @author dylan
 */

public class Register {

    static final String FILE_NAME = "persons.txt";

    // Start registration
    public static void startRegistration() {
        Scanner sc = new Scanner(System.in);

        String fullName = readNonEmpty(sc, "Enter full name: ");
        String id = readNonEmpty(sc, "Enter ID: ");
        int age = readPositiveInteger(sc, "Enter age: ");
        String email = readValidEmail(sc, "Enter email: ");
        String phone = readValidPhone(sc, "Enter phone number: ");

        String line = createRecordLine(fullName, id, age, email, phone);
        saveLine(line);

        System.out.println("Record saved in " + FILE_NAME);
    }

    // ===================== Auxiliary Methods =====================

    static String readNonEmpty(Scanner sc, String prompt) {
        String input;
        do {
            System.out.print(prompt);
            input = sc.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("️ Value cannot be empty. Try again.");
            }
        } while (input.isEmpty());
        return input;
    }

    static int readPositiveInteger(Scanner sc, String prompt) {
        int number = -1;
        while (number <= 0) {
            System.out.print(prompt);
            try {
                number = Integer.parseInt(sc.nextLine());
                if (number <= 0) {
                    System.out.println("️ Enter a positive integer.");
                }
            } catch (NumberFormatException e) {
                System.out.println("️ Enter a valid number.");
            }
        }
        return number;
    }

    static String readValidEmail(Scanner sc, String prompt) {
        String email;
        do {
            System.out.print(prompt);
            email = sc.nextLine().trim();
            if (!email.contains("@")) {
                System.out.println("️ Invalid email. Must contain '@'.");
                email = "";
            }
        } while (email.isEmpty());
        return email;
    }

    static String readValidPhone(Scanner sc, String prompt) {
        String phone;
        do {
            System.out.print(prompt);
            phone = sc.nextLine().trim();
            if (!phone.matches("\\d{8,}")) {
                System.out.println("️ Phone must contain only digits and at least 8 characters.");
                phone = "";
            }
        } while (phone.isEmpty());
        return phone;
    }

    static String createRecordLine(String fullName, String id, int age, String email, String phone) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return fullName + "|" + id + "|" + age + "|" + email + "|" + phone + "|" + now.format(formatter);
    }

    static void saveLine(String line) {
        try (FileWriter fw = new FileWriter(FILE_NAME, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter pw = new PrintWriter(bw)) {
            pw.println(line);
        } catch (Exception e) {
            System.out.println(" Error saving the record: " + e.getMessage());
        }
    }
}
